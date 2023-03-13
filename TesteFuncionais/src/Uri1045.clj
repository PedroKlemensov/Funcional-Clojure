(ns Uri1045)
(require '[clojure.string :as str])
(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))

(def nvetor [a b c])
(def vetorSort (sort nvetor))

(def z (nth vetorSort 2))
(def w (nth vetorSort 0))
(def y (nth vetorSort 1))

(defn tipoLado [z w y]
  (str
    (cond
      (= z w y) "\nTRIANGULO EQUILATERO"
      (or (= z w) (= z y) (= w y)) "\nTRIANGULO ISOSCELES"
      )
    ))


(defn tipoAngulo [z w y] (str
                           (cond
                                (>= z (+ w y)) "NAO FORMA TRIANGULO"
                                (= (* z z) (+ (Math/pow w 2.0) (Math/pow y 2.0)) ) "TRIANGULO RETANGULO"
                                (< (Math/pow z 2.0) (+ (Math/pow w 2.0) (Math/pow y 2.0)) ) "TRIANGULO ACUTANGULO"
                                (> (Math/pow z 2.0) (+ (Math/pow w 2.0) (Math/pow y 2.0)) ) "TRIANGULO OBTUSANGULO"
                                :else "NAO FORMA TRIANGULO"
                             )
                           ))


(print (str(tipoAngulo z w y)(tipoLado z w y) "\n"))

