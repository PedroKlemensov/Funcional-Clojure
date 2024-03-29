(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [cheshire.core :as json]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.json	:refer [wrap-json-body]]
            [financeiro.db :as db]
            [financeiro.transacoes :as transacoes]))

;;fazer seguindo pagina 196-197

(defn como-json [conteudo & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json ; charset=utf-8"}
   :body (json/generate-string conteudo)})

(defroutes app-routes
            (GET "/" [] "oi")
            (GET "/saldo" [] (como-json {:saldo (db/saldo)}))
            (POST "/transacoes"	requisicao
                 (if (transacoes/valida? (:body requisicao))
                   (-> (db/registrar (:body requisicao))
                        (como-json 201))
                   (como-json	{:mensagem "Requisição inválida"} 422)))
           (route/not-found "Recurso não encontrado"))

(def app
  (-> (wrap-defaults app-routes api-defaults)
      (wrap-json-body {:keywords? true :bigdecimals? true})))

;;curl --head http://localhost:3000/saldo (não roda, diz que n acha)
;;lein ring server (tbm n esta rodando)



