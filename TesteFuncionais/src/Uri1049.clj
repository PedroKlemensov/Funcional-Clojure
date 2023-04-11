(ns Uri1049)
(def tipo (str (read-string (read-line))))
(def filo (str (read-string (read-line))))
(def espece (str (read-string (read-line))))


(println (if (= tipo "vertebrado") (if (= filo "ave")  (if (= espece "carnivoro") "aguia" "pomba")    (if (= espece "onivoro")  "homem"  "vaca" )      )
                                   (if (= "inseto") (if (= espece "hematofago") "pulga"  "lagarta"  )     (if (= espece "hematofago") "sanguessuga"  "minhoca"  )  )   )   )
