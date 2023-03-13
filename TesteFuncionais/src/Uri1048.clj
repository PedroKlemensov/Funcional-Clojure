(ns Uri1048)
(def salario (read-string (read-line)))

(defn novosalario [salario porcento]

  (* salario (+ 1 (/ porcento 100.0)))
  )

(println (cond



           ))