(ns Uri1070)
(def limite (read-string (read-line)))
(dorun (map println (range  (cond
                              (even? limite) (+ limite 1)
                              :else limite
                              )  (+ limite 12) 2)))