(ns Uri1115)

(require '[clojure.string :as str])


(defn posscao []

(defn primeiro []
  (println "primeiro")
  (posscao)
  )
  (defn segundo []
    (println "segundo")
    (posscao)
    )
  (defn terceiro []
    (println "terceiro")
    (posscao)
    )
  (defn quarto []
    (println "quarto")
    (posscao)
    )

(def valores (str/split (read-line) #" "))
(def x (read-string (get valores 0)))
(def y (read-string (get valores 1)))

  (cond
      (and (> x 0.0) (> y 0.0)) (primeiro)
      (and (< x 0.0) (> y 0.0)) (segundo)
      (and (< x 0.0) (< y 0.0)) (terceiro)
      (and (> x 0.0) (< y 0.0)) (quarto)
    )


)

(posscao)