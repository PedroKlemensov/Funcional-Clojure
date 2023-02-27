(ns Uri1018)
(def total (read-string (read-line)))

(println total)

(def notas100 (Math/floor (/ total 100)))
(def restode100 (rem a 100))

(def notas50 (Math/floor (/ restode100 50)))
(def restode50 (rem restode100 50))

(def notas20 (Math/floor (/ restode50 20)))
(def restode20 (rem restode20 20))

(def notas10 (Math/floor (/ restode20 10)))
(def restode10 (rem restode10 10))

(def notas5 (Math/floor (/ restode10 5)))
(def restode50 (rem restode100 50))

(def notas50 (Math/floor (/ restode5 50)))
(def restode2 (rem restode 50))

(def notas1 (Math/floor (/ restode2 1)))

