(ns Uri1071)

(def entrada 2)

(defn listaEntrada [n]


  (defn adicinar [p]
    (read-string (read-line))

    )
  (map adicinar (range 0 n))

  )
(def valores (listaEntrada entrada))

(def a (nth valores 0))
(def b (nth valores 1))

(println (reduce +(filter pos? (map (range a b)))))
