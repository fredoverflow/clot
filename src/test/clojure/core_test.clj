(ns core-test
  (:require [clojure.test :refer [deftest is are]])
  (:require [core :refer :all]))

(deftest squares
  (are [xx x] (= xx (square x))
    0 0
    1 1
    4 2
    9 3))
