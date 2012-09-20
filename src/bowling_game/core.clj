(ns bowling-game.core)

(defn score [game]
  ((fn [sum list]
    (if (empty? list)
      sum
      (recur (+ sum (first list)) (rest list)))) 0 game))