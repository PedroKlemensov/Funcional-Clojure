
(require '[clojure.string :as str])
(def vetor (str/split (read-line) #" "))
(def a (read-string (get vetor 0)))
(def b (read-string (get vetor 1)))
(def c (read-string (get vetor 2)))

(def nvetor [a b c])
(def vetorSort (sort nvetor))

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


