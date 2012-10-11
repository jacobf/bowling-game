(ns bowling-game.core-test
  (:require [bowling-game.test-games :as games])
  (:use midje.sweet
        bowling-game.core))

(fact (score (games/gutter)) => 0)

(fact (score (games/roll-all 4)) => 80)
