(ns Teste006)

(def empates 0)
(def vgremio 4)
(def vinter 1)

(def ganhador  (cond
                 (and (> empates vinter) (> empates vgremio)) (str "Nao houve vencedor")
                 (> vgremio vinter) (str "Gremio venceu mais")
                 (< vgremio vinter) (str "Inter venceu mais")
                 ))



(println ganhador)