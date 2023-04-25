(ns Uri1094)
(require '[clojure.string :as str])

(def entrada (read-string (read-line)))
(defn listaEntrada [n]
  (map
    (fn [*]
        (def dados (str/split (read-line) #" "))
        (def x (read-string (get dados 0)))
        (def y  (get dados 1))

      (hash-map :quantidade x :tipo y) )

    (range 0 n))
  )

(def valores (listaEntrada entrada))

(defn so-valor [reg] (:quantidade reg))

(defn r? [reg]
  (= "R" (:tipo reg)))
(defn c? [reg]
  (= "C" (:tipo reg)))
(defn s? [reg]
  (= "S" (:tipo reg)))


(def somaTotal (reduce + (map so-valor valores)))
(def soma-rat (reduce + (map so-valor (filter r? valores))))
(def soma-co (reduce + (map so-valor (filter c? valores))))
(def soma-frog (reduce + (map so-valor (filter s? valores))))

(print (format
         "Total: %d cobaias\nTotal de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d\nPercentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n"
         somaTotal
         soma-co
         soma-rat
         soma-frog
         (/ (* soma-co 100.0) somaTotal)
         (/ (* soma-rat 100.0) somaTotal)
         (/ (* soma-frog 100.0) somaTotal)))






