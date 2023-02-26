(ns Uri1008)
(def id (read-string (read-line)))
(def horas (read-string (read-line)))
(def mult (read-string (read-line)))

(println "NUMBER =" id)
(def salario (* horas mult))
(println  (format  "SALARY = U$ %.2f" salario) )