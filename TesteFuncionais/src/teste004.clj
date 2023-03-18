(ns teste004)


(defn peganota1 []

  (defn errado1 []
    (println "nota invalid")
    (peganota1)
    )

  (def nota1 (read-string (read-line)))
  (cond
    (and (<= 0 nota1) (<= nota1 10)) (+ 0 0)
    :else (errado1)
    )
  )
(peganota1)