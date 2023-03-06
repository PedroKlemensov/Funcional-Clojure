(ns Uri1037)
(def valor (read-string (read-line)))

(cond
  (and (<= 0.00 valor) (<= valor 25.00)) (println "Intervalo [0,25]")
  (and (< 25.00 valor) (<= valor 50.00)) (println "Intervalo (25,50]")
  (and (< 50.00 valor) (<= valor 75.00)) (println "Intervalo (50,75]")
  (and (< 75.00 valor) (<= valor 100.00)) (println "Intervalo (75,100]")

  :else (println "Fora de intervalo")
  )
