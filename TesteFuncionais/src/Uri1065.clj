(ns Uri1065)


(def entrada 5)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(println (count (filter even? valores) ) "valores pares" )

