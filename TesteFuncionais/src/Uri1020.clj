(ns Uri1020)
(def total (read-string (read-line)))

(def anos (quot total 365))
(def restodeano (mod total 365))
(def meses (quot restodeano 30))
(def dias (mod restodeano 30))

(println (format "%d ano(s)\n%d mes(es)\n%d dia(s)" anos meses dias   ))
