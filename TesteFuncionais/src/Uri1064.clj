(ns Uri1064)

(def entrada 6)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(println (count (filter pos? valores) ) "valores positivos" )
(println (format "%.1f" (/ (reduce +(filter pos? valores) ) (count (filter pos? valores) ) ))  )
