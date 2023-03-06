(ns Uri1035)
(require '[clojure.string :as str])

(def entrada (str/split (read-line) #" "))
(def a (read-string (get entrada 0)))
(def b (read-string (get entrada 1)))
(def c (read-string (get entrada 2)))
(def d (read-string (get entrada 3)))

(cond
  (> b c) (println "Valores nao aceitos")
  (> d a) (println "Valores nao aceitos")
  (> (+ c d) (+ a b)) (println "Valores nao aceitos")
  (> c 0) (> d 0) (println "Valores nao aceitos")
  (even? a) (println "Valores nao aceitos")

  )
