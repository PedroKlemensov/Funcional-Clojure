(ns Uri1072)

(def entrada (read-string (read-line)))

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(defn dentro [n]
  (and  (<= 10 n)  (<= n 20))
  )
