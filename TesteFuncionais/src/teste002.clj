(ns teste002)
(def fun (cond
           (and (< 0 valor) (< valor 25)) (println "Intervalo (0,25]")
           (and (< 26 valor) (< valor 50)) (println "Intervalo (25,50]")
           (and (< 51 valor) (< valor 75)) (println "Intervalo (50,75]")
           (and (< 76 valor) (< valor 100)) (println "Intervalo (75,100]")

           :else (println "Fora de inter")))