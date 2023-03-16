(ns Uri1078)
(def numero (read-string (read-line)))

(defn meuprint [mapn]
  (str (format "%d x %d = %d" mapn ,numero ,(* mapn numero)  ) ) )


(dorun (map  #(println (meuprint %)) (range 1 11  ) )   )