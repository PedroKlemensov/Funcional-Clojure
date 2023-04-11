(ns Uri1117)

(defn calculamedia []









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


  )

(calculamedia)