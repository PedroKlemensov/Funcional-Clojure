(ns Uri1048)


(def salario (read-string (read-line)))

(defn novosalario [porcento]

  (* salario (+ 1 (/ porcento 100.0)))
  )


(println (cond
           (>= 400.00 salario) (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%" (novosalario 15) (- (novosalario 15) salario) )
           (and (>= salario 400.01 ) (>= 800.00 salario)) (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%" (novosalario 12) (- (novosalario 12) salario) )
           (and (>= salario 800.01 ) (>= 1200.00 salario)) (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%" (novosalario 10) (- (novosalario 10) salario) )
           (and (>=  salario 1200.01 ) (>= 2000.00 salario)) (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%" (novosalario 7) (- (novosalario 7) salario) )
           (< 2000.00 salario) (format "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%" (novosalario 4) (- (novosalario 4) salario) )
           ))