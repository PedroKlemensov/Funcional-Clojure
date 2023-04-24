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


(def somaTotal (reduce + (map so-valor valores)))
(def soma-rat (reduce + (map so-valor (filter r? valores))))
(def soma-rat (reduce + (map so-valor (filter r? valores))))
(def soma-frg (reduce + (map so-valor (filter r? valores))))

(println somaTotal)
(println soma-rat)


