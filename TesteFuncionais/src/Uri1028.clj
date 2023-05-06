(ns Uri1028)
(require '[clojure.string :as str])



(defn listaEntrada [n]
  (map (fn [p] (mapv #(Integer/parseInt %) (str/split (read-line) #" "))
         )
       (range n)))

(def valores (listaEntrada (read-string (read-line))))



(defn MDC [a b]
  (if (= b 0)
    (println a)
    (recur b (rem a b))))



(defn chamada [reg]
  (MDC (apply max reg) (apply min reg)))

(doseq [v valores]
  (chamada v))
