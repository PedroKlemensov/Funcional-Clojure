(ns Uri1165)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n))
  ) (def valores (listaEntrada (read-string (read-line))))


(defn primo? [n]
  (if (= n 2)
    true
    (and (> n 1) (not-any? zero? (map #(rem n %) (range 2 (inc (Math/sqrt n))))))))



(doseq [n valores]

  (if (primo? n)
    (println n "eh primo")
    (println n "nao eh primo")))
