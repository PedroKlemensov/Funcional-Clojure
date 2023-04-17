(ns Uri1094)
(def entrada 100)
(defn listaEntrada [n]
  (map (fn [*] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))

(map)