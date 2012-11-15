(ns bowling-game.core)

(defn sumOfFrame [frame]
  (if (= (first (first frame)) "/")
    (+ 10 (first (second frame)))
    (if (= (first (first frame)) "X")
      (if (= (first (second frame)) "X")
		(if (= (first (nth frame 2 [0 0])) "X")
          30
          (+ 20 (first (nth frame 2 [0 0])))
        )
		(+ 10 (+ (first (second frame)) (second (second frame))))
      )
      (+ (first (first frame)) (second (first frame)))
    )
  )
)

(defn frames [game]
  ((fn [myseq partgame]
     (if (empty? partgame)
       myseq
       (if (= (first partgame) 10)
         (recur (conj myseq ["X"]) (next partgame))
         (if (= (+ (first partgame) (second partgame)) 10)
           (recur (conj myseq ["/"]) (nnext partgame))
           (recur (conj myseq [(first partgame) (second partgame)]) (nnext partgame))
         )
       )
     )
    ) 
   [] game)
)

(defn score [game]
  ((fn [sum restgame]
     (if (empty? restgame)
       sum
       (recur (+ sum (sumOfFrame [(first restgame) (second restgame) (nth restgame 2 [0 0])])) (rest restgame))
       )
     ) 
   0 (frames game))
)