(ns Uri1118)
(defn calculamedia []

  (defn novo []
    (println "novo calculo (1-sim 2-nao)")
    (def denovo (read-string (read-line)))
    (cond
      (= denovo 1) (calculamedia)
      (and (not= denovo 1) (not= denovo 2) ) (novo)
      )
    )

  (defn peganota1 []

    (defn errado1 []
      (println "nota invalida")
      (peganota1)
      )

    (def nota1 (read-string (read-line)))
    (cond
      (and (<= 0 nota1) (<= nota1 10)) (+ 0 0)
      :else (errado1)
      )
    )

  (defn peganota2 []

    (defn errado2 []
      (println "nota invalida")
      (peganota2)
      )

    (def nota2 (read-string (read-line)))
    (cond
      (and (<= 0 nota2) (<= nota2 10)) (+ 0 0)
      :else (errado2)
      )
    )

  (peganota1)

  (peganota2)

  (println (format "media = %.2f" (double (/ (+ nota1 nota2) 2))) )

  (novo)

  )

(calculamedia)
