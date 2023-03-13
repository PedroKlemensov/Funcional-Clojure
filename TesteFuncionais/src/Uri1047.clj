(ns Uri1047)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))
(def d (read-string (get valores 3)))

(defn minustos [b d]
  (cond
    (> b d ) (- b d)
    :else (- d b)
    )
  )


(println  (cond
            (and (= a 0) (= b 0) (= c 0) (= d 0) ) "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"
            (and (= a b c d) ) "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"
            (and (>= a c) (>= b d))(format "O JOGO DUROU %d HORA(S) E %d MINUTO(S)" (-(+ (- c a) 24)1)  (+ (- 60 b)d))
            (and (<= a c)(>= b d))(format "O JOGO DUROU %d HORA(S) E %d MINUTO(S)" (-(- c a)1) (+(- 60 b)d))
            (> a c) (format "O JOGO DUROU %d HORA(S) E %d MINUTO(S)" (+ (- 24 a) c) (minustos b d) )
            (< a c) (format "O JOGO DUROU %d HORA(S) E %d MINUTO(S)" (- c a) (minustos b d))
            (and (= a 0) (= c 0)) (format "O JOGO DUROU 0 HORA(S) E %d MINUTO(S)" (minustos b d))
           (= c a) (format "O JOGO DUROU 0 HORA(S) E %d MINUTO(S)" (minustos b d))

            :else "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"
            ))
