(ns Uri1011)
(def raio (read-string (read-line)))
(def volume (/ (*  4 3.14 (Math/pow raio 3) ) 3))
(println (format "VOLUME = %.3f" volume))

