(ns Uri1072)

(def entrada (read-string (read-line)))

(defn listaEntrada [n]
  (map (fn [*] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(defn dentro [n]
  (and  (<= 10 n)  (<= n 20))
  )

(println (count (filter dentro valores)) "in")
(println (- (count valores) (count (filter dentro valores ) ) ) "out")

