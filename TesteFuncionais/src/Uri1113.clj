(ns Uri1113)
(require '[clojure.string :as str])

(defn numeros
  (def orden (str/split (read-line) #" "))
  (def n1 (read-string (get orden 0)))
  (def n2 (read-string (get orden 1)))

  (cond
    (> n1 n2) (println "Crescente")
    (> n2 n1) (println "Decrescente")
    )
  )

(numeros)