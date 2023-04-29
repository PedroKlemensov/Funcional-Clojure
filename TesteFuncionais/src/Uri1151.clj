
(ns Uri1151)

(defn listaEntrada [n]
  (map (fn [p] (read-string (read-line))) (range 0 n)))

(def valores (listaEntrada 1))

(def fibonacci [0 1])
(defn fibonacci-c []
  (def fibonacci (conj fibonacci (+ (nth fibonacci (- (count fibonacci) 2)) (nth fibonacci (- (count fibonacci) 1))))))

(doseq [i (range 2 (first valores))] (fibonacci-c))

(println (clojure.string/join " " (map str fibonacci)))

