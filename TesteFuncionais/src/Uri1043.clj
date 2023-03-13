(ns Uri1043)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))



(println (cond
           (and (and (< (- b c) a) (< a (+ b c))) (and (< (- a c) b) (< b (+ a c))) (and (< (- a b) c) (< c (+ a b))) )  (str "Perimetro = " (+ a b c))


           :else (str "Area = " (/ (* c (+ a b)) 2))
           ))