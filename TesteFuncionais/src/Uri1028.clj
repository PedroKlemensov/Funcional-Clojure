(ns Uri1028)
(require '[clojure.string :as str])


(defn listaEntrada [n]
  (map (fn [p]
         ((str/split (read-line) #" "))
         )
       (range 0 n))
  )

(def valores (listaEntrada (read-string (read-line))))

(println valores)
