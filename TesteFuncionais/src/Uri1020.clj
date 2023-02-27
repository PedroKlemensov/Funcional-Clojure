(ns Uri1020)
(def total (read-string (read-line)))

(def anos (Math/floor(/ total 365)))
(def restodeano (rem total 365))
(def meses (Math/floor (/ restodeano 30)))
(def restodemeses (rem meses 30))
(def dias (Math/floor (/ restodemeses 30)))



(print (format "%.0f" anos))
(print ":")
(print (format "%.0f" meses))
(print ":")
(print dias)
(println )
