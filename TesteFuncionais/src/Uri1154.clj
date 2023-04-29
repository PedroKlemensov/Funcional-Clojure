(ns Uri1154)
(def valores '())
(defn listaEntrada []
  (defn juntar [p]
    (def valores (conj valores p))
    (listaEntrada)
    )
(def valor (read-string (read-line)))
  (cond
    (pos? valor) (juntar valor)
    )

  ) (listaEntrada )

(println (format "%.2f" (float (/ (reduce + valores) (count valores)))))
