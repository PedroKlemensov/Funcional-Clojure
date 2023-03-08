(ns Uri1035)
(require '[clojure.string :as str])

(def entrada (str/split (read-line) #" "))
(def a (read-string (get entrada 0)))
(def b (read-string (get entrada 1)))
(def c (read-string (get entrada 2)))
(def d (read-string (get entrada 3)))


(println (cond
           (and (> b c) (> d a) (> (+ c d) (+ a b)) (> c 0) (> d 0) (even? a)) "Valores aceitos"
           :else "Valores nao aceitos"))