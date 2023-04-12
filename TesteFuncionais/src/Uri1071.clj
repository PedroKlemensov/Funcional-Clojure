(ns Uri1071)

(def entrada 2)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(def a (apply min valores))
(def b (apply max valores ))

(println (reduce + (filter odd?  (range (inc a) b))))
