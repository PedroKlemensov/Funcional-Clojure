(defn factorial [n]
  (reduce * (range 1 (inc n))))

(println(factorial 4))
