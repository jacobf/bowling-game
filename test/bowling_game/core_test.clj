(ns bowling-game.core-test
  (:use midje.sweet
        bowling-game.core))

(fact (score (repeat 20 0)) => 0)

(fact (frames (repeat 4 0)) => [[0 0] [0 0]])

(fact (frames (repeat 2 10)) => [["X"] ["X"]])

(fact (frames [2 8 0 7 10]) => [["/"][0 7]["X"]])

(fact (frames [1 9 2 8 3 7 4 6 5 5]) => [["/"]["/"]["/"]["/"]["/"]])

(fact (score [10 1 1]) => 14)

(fact (score [1 2 3 7 1 1 10 4 5]) => 44)

(fact (score [10 10 5 3 1 1]) => 53)

(fact (sumOfFrame [[1 2] ["X"]]) => 3)

(fact (sumOfFrame [["X"] ["X"] ["X"]]) => 30)

(fact (sumOfFrame [["x"] ["X"] [5 3]]) => 25)

(fact (sumOfFrame [["x"] [5 2]]) => 17)

(fact (sumOfFrame [["/"] [1 1]]) => 11)