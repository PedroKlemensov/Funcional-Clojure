(ns CalculaNotaDimitri)
(defn calculamedia [cadeira, ap, ab, ntd]

  (def calculo (/
                 (+ (* ap 2) (* ab 2) ntd)
                  5) )


  ;(println cadeira ":" )
  ;(println (+ (* ap 2) (* ab 2) ntd))
  (print (format  "%s: %.2f" cadeira calculo))
  )

(calculamedia "ciencias" 8.5 3.5 9.3)