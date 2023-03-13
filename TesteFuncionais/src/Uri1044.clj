(ns Uri1044)
(require '[clojure.string :as str])
(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))

(println (cond (or (zero? (mod b a)) (zero? (mod a b)) )
               "Sao Multiplos"
               :else "Nao sao Multiplos"))