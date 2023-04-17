(ns Uri1080)
(def entrada 100)
(defn listaEntrada [n]
  (map (fn [*] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(println   (apply max valores))
(println (inc (.indexOf valores (apply max valores))))