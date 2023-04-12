(ns Uri1066)


(def entrada 6)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(println (count (filter even? valores) ) "valor(es) par(es)" )
(println (count (filter odd? valores) ) "valor(es) impar(es)" )
(println (count (filter pos? valores) ) "valor(es) positivo(s)" )
(println (count (filter neg? valores) ) "valor(es) negativo(s)" )
