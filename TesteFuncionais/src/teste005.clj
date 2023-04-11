(ns teste005)
(def linhas (read-string (read-line)))
(def aux 1)
(def aux2 1)
(defn chamar []
  (defn pum []
    (println (format "%d %d %d pum" aux (+ aux 1) (+ aux 2)))
    (def aux (+ aux 4))
    (def aux2 (+ aux2 1))
    (chamar)
    )
  (cond
    (>= linhas aux2) (pum)
    )
  )
(chamar)