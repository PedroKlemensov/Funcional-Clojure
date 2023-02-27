(ns Uri1018)
(def total (read-string (read-line)))



(def notas100 (Math/floor (/ total 100)))
(def restode100 (rem total 100))

(def notas50 (Math/floor (/ restode100 50)))
(def restode50 (rem restode100 50))

(def notas20 (Math/floor (/ restode50 20)))
(def restode20 (rem restode50 20))

(def notas10 (Math/floor (/ restode20 10)))
(def restode10 (rem restode20 10))

(def notas5 (Math/floor (/ restode10 5)))
(def restode5 (rem restode10 5))

(def notas2 (Math/floor (/ restode5 2)))
(def restode2 (rem restode5 2))

(def notas1 (Math/floor (/ restode2 1)))


(println total)

(println (format "%.0f" notas100)"nota(s) de R$ 100,00")
(println (format "%.0f" notas50)"nota(s) de R$ 50,00")
(println (format "%.0f" notas20)"nota(s) de R$ 20,00")
(println (format "%.0f" notas10)"nota(s) de R$ 10,00")
(println (format "%.0f" notas5)"nota(s) de R$ 5,00")
(println (format "%.0f" notas2)"nota(s) de R$ 2,00")
(println (format "%.0f" notas1)"nota(s) de R$ 1,00")