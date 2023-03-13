(ns Uri1046)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))


(println  (cond
                (and (= a 0) (= b 0)) "O JOGO DUROU 24 HORA(S)"
                (> a b) (format "O JOGO DUROU %d HORA(S)" (+ (- 24 a) b) )
                (< a b) (format "O JOGO DUROU %d HORA(S)" (- b a))
                :else "O JOGO DUROU 24 HORA(S)"
                ))
