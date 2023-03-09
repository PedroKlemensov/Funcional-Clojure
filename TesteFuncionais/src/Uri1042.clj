
(require '[clojure.string :as str])
(def valores (str/split (read-line) #" "))
(def primeiro (read-string (get valores 0)))
(def segundo (read-string (get valores 1)))
(def terceiro (read-string (get valores 2)))

(defn organizar [valores]
  (def aux0 (valores 0))
  (def aux1 (valores 1))
  (def aux3 (valores 2))

  (cond
    (< aux1 aux)

    ))