(ns Uri1060)
(def entrada 6)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
) (def valores (listaEntrada entrada))

(println (count (filter pos? valores) ) "valores positivos" )
