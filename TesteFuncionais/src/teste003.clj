(ns teste003)
(require '[clojure.string :as str])
(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))

(defn tipoLado [a b c]

    (cond
      (= a b c) "TRIANGULO EQUILATER"
      (or (= a b) (= a c) (= c b)) "TRIANGULO ISOSCELES"

    ))


(defn tipoAngulo [a b c]
                           (cond
                             (= (Math/pow a 2) (+ (Math/pow b 2) (Math/pow c 2))) (str "TRIANGULO RETANGULO\n" (tipoLado a b c))
                             (> (Math/pow a 2) (+ (Math/pow b 2) (Math/pow c 2))) (str "TRIANGULO OBTUSANGULO\n"(tipoLado a b c))
                             (< (Math/pow a 2) (+ (Math/pow b 2) (Math/pow c 2))) (str "TRIANGULO ACUTANGULO\n"(tipoLado a b c))
                             :else "NAO FORMA TRIANGULO"

                           ))


(println (tipoAngulo a b c))
