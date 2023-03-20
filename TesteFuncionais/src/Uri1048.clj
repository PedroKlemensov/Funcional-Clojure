(ns Uri1048)
(def salario (read-string (read-line)))

(defn novosalario [porcento]

  (* salario (+ 1 (/ porcento 100.0)))
  )

;(format "%.2f\n%.2f" (novosalario 15) (- (novosalario 15) salario) )

(println (cond
           (>= 400 salario) (format "Novo salario: %.2f \nReajuste ganho: %.2f \nEm percentual: 15 %" 460.000 60.000
                                    )

           ))