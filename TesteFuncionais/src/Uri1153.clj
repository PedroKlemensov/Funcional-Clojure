(ns Uri1153)
(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada 1))


(println (reduce * (range 1 (inc (last valores)))))
