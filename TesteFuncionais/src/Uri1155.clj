(ns Uri1155)



(print (format "%.2f" (float (reduce +(map #((fn [d]
                                               (/ 1 d)
                                               ) %) (range 1 101))
                                     ))))
