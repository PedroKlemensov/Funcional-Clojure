(ns Uri1133)
(def a (read-string (read-line)))
(def b (read-string (read-line)))

(defn divisor [mapn]
  (cond
     (= (rem mapn 5) 2)  (println mapn)
     (= (rem mapn 5) 3)  (println mapn)
    )
  )

(cond
  (< a b) (dorun (map  #(divisor %)  (range (+ 1 a) b ) ) )
  (> a b) (dorun (map  #(divisor %)  (range (+ 1 b) a ) ) )
  )