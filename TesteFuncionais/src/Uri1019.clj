(ns Uri1019)
(def total (read-string (read-line)))


(def horas (Math/floor(/ total 3600)))
(def restodehora (rem total 3600))
(def minutos (Math/floor (/ restodehora 60)))
(def segundos (rem restodehora 60))


(print (format "%.0f" horas))
(print ":")
(print (format "%.0f" minutos))
(print ":")
(print segundos)
(println )
