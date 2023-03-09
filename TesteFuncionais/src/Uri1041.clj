(ns Uri1041)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def x (read-string (get valores 0)))
(def y (read-string (get valores 1)))

(println (cond
           (and (> x 0.0) (> y 0.0)) "Q1"
           (and (< x 0.0) (> y 0.0)) "Q2"
           (and (< x 0.0) (< y 0.0)) "Q3"
           (and (> x 0.0) (< y 0.0)) "Q4"
           (and (= x 0.0) (not= y 0.0)) "Eixo Y"
           (and (not= x 0.0) (= y 0.0)) "Eixo X"
            :else "Origem"
           ))
