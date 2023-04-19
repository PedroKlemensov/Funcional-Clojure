(ns Uri1073)
(def a (read-string (read-line)))
(defn calcula [a]
  (println (format "%d^2 = %d" a (* a a)))
  )
(dorun (map #(calcula %) (range 2 (+ a 1) 2) )   )
