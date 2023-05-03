(ns Uri1134)
(def valores '())
(defn listaEntrada [*]
  (def valor (read-string (read-line)))
  (def valores (conj valores valor))
  (cond(not= valor 4 ) (listaEntrada ()))
  ) (listaEntrada ())


(count (filter #(= % 4) valores))

(println (format "MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d"
                 (count (filter #(= % 1) valores))
                 (count (filter #(= % 2) valores))
                 (count (filter #(= % 3) valores))))