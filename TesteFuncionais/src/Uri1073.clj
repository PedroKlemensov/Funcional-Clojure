

(require '[clojure.string :as str])

(def valores (str/split (read-line) #" "))
(def a (read-string (get valores 0)))

(defn pow-print [a] (format "%d^2 = %.0f" a (Math/pow a 2)))
(dorun (map println (map pow-print (range 2 (inc a) 2))))