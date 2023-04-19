(ns Uri1075)
(require '[clojure.string :as str])

(def numero (read-string (read-line)))

(defn divisor [mapn]
(cond
    (= (rem mapn numero) 2) mapn
    :else -1
)  )

(dorun (map println (#(divisor %)  (range 1 100)) ) )