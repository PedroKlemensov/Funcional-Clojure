(ns Uri1116)
(require '[clojure.string :as str])
(def limite (read-string (read-line)))

(defn divicao [a]
  (def valores (str/split (read-line) #" "))
  (def x (read-string (get valores 0)))
  (def y (read-string (get valores 1)))

  (cond
    (= y 0) (println "divisao impossivel")
    :else (println (format "%.1f" (double(/ x y)) )  )
    )

  )

(dorun (map divicao (range 0 limite)  )  )