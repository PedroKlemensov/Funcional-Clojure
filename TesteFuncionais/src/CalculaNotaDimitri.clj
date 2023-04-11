(ns CalculaNotaDimitri)
(defn calculamedia [cadeira, ap, ab, ntd]

  (def calculo (/
                 (+ (* ap 2) (* ab 2) ntd)
                  5) )


  (println cadeira ":" )
  (println (+ (* ap 2) (* ab 2) ntd))
  (print (format  "%.2f" calculo))
  )

(calculamedia "ciencias" 8.3 3.5 9.3)