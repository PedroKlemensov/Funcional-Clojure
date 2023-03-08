(ns Uri1040)
(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def nota1 (read-string (get valores 0)))
(def nota2 (read-string (get valores 1)))
(def nota3 (read-string (get valores 2)))
(def nota4 (read-string (get valores 3)))

(def media (/ (+ (* nota1 2) (* nota2 3) (* nota3 4) (* nota4 1)) 10))

(defn recuperacao [nota]
  (def notaRecuperacao (read-string (read-line)))
  (def mediaNova (/ (+ nota notaRecuperacao) 2))
  (str "Aluno em exame.\n"
       (format "Nota do exame: %.1f\n" notaRecuperacao)
       (cond
         (>= media 5.0) "Aluno aprovado.\n"
         :else "Aluno reprovado.\n")
       (format "Media final: %.1f"mediaNova)
       ))

(println
  (str (format "Media: %.1f\n" media)
       (cond
         (>= media 7.0) "Aluno aprovado."
         (< media 5.0) "Aluno reprovado."

         :else (recuperacao media)
         )

       ))

