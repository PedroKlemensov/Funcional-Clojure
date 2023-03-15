(ns Uri1074)
(def qauntidade (read-string (read-line)))

(defn possitivo [numero]
  (cond
    (> numero 0) "POSITIVE"
    :else "NEGATIVE"
    )
  )

(defn par [numero]
  (cond
    (even? numero) (str "EVEN " (possitivo numero))
    :else (str "ODD " (possitivo numero))
    )

  )


(defn zero [numero]
  (cond
    (not= numero 0) (par numero)
    :else "NULL"
    )
  )

(defn meuprint [_]
  (def numero (read-string (read-line)))
    (println (zero numero))
  )






(dorun (map meuprint  (range 0 qauntidade)  )  )
