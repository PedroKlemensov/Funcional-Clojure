(ns Uri1079)
(require '[clojure.string :as str])
(def alunos (read-string (read-line)))

(defn media [_]
  (def notas (str/split (read-line) #" "))
  (def n1 (read-string (get notas 0)))
  (def n2 (read-string (get notas 1)))
  (def n3 (read-string (get notas 2)))

  (println (format "%.1f" (/  (+ (* n1 2 ) (* n2 3  ) (* n3 5  ) )   10 ) ))
  )

(dorun (map #(media %)  (range 0 alunos) ))