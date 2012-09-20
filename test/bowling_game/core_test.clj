(ns bowling-game.core-test
  (:require [bowling-game.test-games :as game])
  (:use midje.sweet
        bowling-game.core))

(fact (score (repeat 20 0)) => 0)

(fact (score (repeat 20 4)) => 80)
