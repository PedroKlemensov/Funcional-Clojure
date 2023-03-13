(ns Uri1060)
(def limite (read-string (read-line)))
(dorun (map println (range 1 (+ limite 1) 2)))