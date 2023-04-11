(ns Uri1036)
(require '[clojure.string :as str])

(def entrada (str/split (read-line) #" "))
(def a (read-string (get entrada 0)))
(def b (read-string (get entrada 1)))
(def c (read-string (get entrada 2)))

(println (cond
           (or (= a 0.00) (<  (- (Math/pow b 2.00) (* 4.00 a c))   0)) "Impossivel calcular"
            :else (format "R1 = %.5f\nR2 = %.5f" (/ (+(* b -1) (Math/sqrt (- (Math/pow b 2) (* 4.00 a c)))) (* 2 a)) (/ (-(* b -1) (Math/sqrt (- (Math/pow b 2) (* 4.00 a c)))) (* 2 a)))
           ))