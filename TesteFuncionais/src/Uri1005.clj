(ns Uri1005)
(def nota1 (* 3.5 (read-string (read-line))))
(def nota2 (* 7.5 (read-string (read-line))))
(def media (/ (+ nota1 nota2) 11))
(println (format "MEDIA = %.5f" media))

