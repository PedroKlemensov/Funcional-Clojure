(ns Uri1131)
(require '[clojure.string :as str])

(def entrada (list))
(defn listaEntrada [*]
  (def gols (str/split (read-line) #" "))
  (def x (read-string (get gols 0)))
  (def y (read-string (get gols 1)))

  (def entrada (conj entrada (hash-map :Inter x :Gremio y)))
  (println "Novo grenal (1-sim 2-nao)")
  (def novo (read-string (read-line)))
  (cond (== novo 1) (listaEntrada ())  )
  )
   (listaEntrada ())


(defn gremio? [jogos]
  (> (:Gremio jogos) (:Inter jogos))
  )
(defn inter? [jogos]
  (< (:Gremio jogos) (:Inter jogos))
  )
(defn enpate? [jogos]
  (== (:Gremio jogos) (:Inter jogos))
  )

(def vgremio (count (filter gremio? entrada)))

(def vinter (count (filter inter? entrada)))

(def empates (count (filter enpate? entrada)))

(def ganhador  (cond
                 (and (> empates vinter) (> empates vgremio)) (str "Nao houve vencedor")
                 (> vgremio vinter) (str "Gremio venceu mais")
                 (< vgremio vinter) (str "Inter venceu mais")
                 ))
(println (str (count entrada) " grenais"))
(println (str "Inter:" vinter))
(println (str "Gremio:" vgremio))
(println (str "Empates:" empates))
(println ganhador)
