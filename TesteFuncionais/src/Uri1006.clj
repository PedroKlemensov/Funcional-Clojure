(ns Uri1006)
(def nota1 (* 2 (read-string (read-line))))
(def nota2 (* 3 (read-string (read-line))))
(def nota3 (* 5 (read-string (read-line))))
(def media (/ (+ nota1 nota2 nota3) 10))
(println (format "MEDIA = %.1f" media))

