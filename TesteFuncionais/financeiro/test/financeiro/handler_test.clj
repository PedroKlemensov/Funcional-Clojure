(ns financeiro.handler-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [cheshire.core :as json]
            [financeiro.handler :refer :all]
            [financeiro.db :as db]))

(facts "Dá um 'Olá, mundo!' na rota raiz"
       (let	[response	(app (mock/request :get "/"))]
         (fact "o	status da reposta	é	200"
               (:status	response)	=>	200)
         (fact "o	texto	do corpo é 'Olá, mundo!'"
               (:body	response)	=> "oi")))


(facts "Rota inválida não existe"
       (let	[response	(app (mock/request :get	"/invalid"))]
         (fact "o	código de erro é	404"
               (:status	response)	=> 404)
         (fact "o	texto	do corpo é 'Recurso	não	encontrado'"
               (:body	response)	=> "Recurso não encontrado")))


(facts "Saldo	inicial	é	0"
       ;;	aqui	a	gente	define	o	mock
       (against-background [(json/generate-string {:saldo 0})
                            => "{\"saldo\":0}"
                            (db/saldo) => 0])

       (let	[response	(app (mock/request :get	"/saldo"))]
         (fact "o formato é 'application/json'"
               (get-in response [:headers "Content-Type"])
               => "application/json; charset=utf-8")

         (fact "o	status da	resposta é 200"
               (:status	response)	=> 200)

         ;;	e	aqui	nós	mudamos	a	descrição	e	o	conteúdo	do	fato
         (fact "o	texto	do corpo é um	JSON cuja	chave	é	saldo	e	o	valor	é 0"
               (:body	response)	=> "{\"saldo\":0}")))

;;qualquer quebra de linha pode ser um problema, cuidado ao copiar do livro

(facts "geristrar receita 10"
       (against-background (db/registrar {:valor 10
                                          :tipo "receita"})
                           => {:id 1 :valor 10 :tipo "receita"})
       (let [response
             (app (-> (mock/request :post "/transacoes")
                      (mock/json-body {:valor 10 :tipo "receita"})))]
         (fact "o status da resposta é 201"
               (:status response) => 201)
         (fact "o texto do corpo e um JSON com content de um ID"
               (:body response) => "{\"id\":1,\"valor\":10,\"tipo\":\"receita\"}")))
