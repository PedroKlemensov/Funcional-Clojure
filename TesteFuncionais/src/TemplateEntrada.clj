(ns TemplateEntrada)

(def entrada 4)
(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada entrada))



(print valores)