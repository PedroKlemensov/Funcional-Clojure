(ns Uri1114)
(def coreto 2002)


(defn senha []

  (defn errado []
    (println "Senha Invalida")
    (senha)
    )

  (def inset (read-string (read-line)))
  (cond
    (= inset coreto) (println "Acesso Permitido")
    :else (errado)
    )
  )

(senha)