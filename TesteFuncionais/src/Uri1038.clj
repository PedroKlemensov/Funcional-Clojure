(ns Uri1038)
(require '[clojure.string :as str])

(def entrada (str/split (read-line) #" "))
(def tipo (read-string (get entrada 0)))
(def quatidade (read-string (get entrada 1)))

(cond
             (= tipo 1) (def total (* quatidade 4.00))
             (= tipo 2) (def total (* quatidade 4.50))
             (= tipo 3) (def total (* quatidade 5.00))
             (= tipo 4) (def total (* quatidade 2.00))
             (= tipo 5) (def total (* quatidade 1.50))
             )

(println (format "Total: R$ %.2f" total))