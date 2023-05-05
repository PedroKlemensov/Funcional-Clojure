(ns Uri1156)

(def dividendo (range 1 40 2))

(def divisor
               (take (count dividendo) (iterate #(* 2 %) 1)))


(println   (format "%.2f" (float (+ 1(reduce +(map #( (fn [d]
                                         (/ (nth dividendo d) (nth divisor d)))
                                      %)
                                    (range 1 (count divisor))))
                     )))
           )




