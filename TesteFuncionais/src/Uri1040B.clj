(ns Uri1040B)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))
(def b (read-string (get valores 1)))
(def c (read-string (get valores 2)))
(def d (read-string (get valores 3)))

(def media (/ (+ (* a 2.0) (* b 3.0) (* c 4.0) (* d 1.0)) 10.0))
(println (format "Media: %.1f" media))

(defn exame [media]
  (println "Aluno em exame.")
  (def x (read-string (read-line)))
  (def mediaF (/ (+ media x) 2.0))
  (println (format "Nota do exame: %.1f" x))

  (cond (>= mediaF 5.0) (println "Aluno aprovado.")
        (< mediaF 4.9) (println "Aluno reprovado.")
        )
  (println (format "Media final: %.1f" mediaF))
  )

(defn passou [media]
  (cond (>= media 7.0) (println "Aluno aprovado.")
        (< media 5.0)  (println "Aluno reprovado.")
        :else (exame media)
        ))

(passou media)