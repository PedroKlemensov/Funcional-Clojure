
(require '[clojure.string :as str])
(def vetor (str/split (read-line) #" "))

(def vetorSort (sort vetor))

;(println (nth vetorSort 0))
(println (str
           (nth vetorSort 0)"\n"
           (nth vetorSort 1)"\n"
           (nth vetorSort 2)"\n"
           "\n"
           (get vetor 0)"\n"
           (get vetor 1)"\n"
           (get vetor 2)

           )

         )


