(ns travis-ci-demo.core-test
  (:require [clojure.test :refer :all]
            [travis-ci-demo.core :refer :all]))

(deftest test-greeting
  (testing "Should return greeting"
    (is (= "Hello, Foo!" (greeting "Foo")))))
