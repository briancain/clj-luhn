(ns clj-luhn.core-test
  (:require [clojure.test :refer :all]
            [clj-luhn.core :refer :all]))

(deftest validate-number-test
  (testing "if a credit card number is valid"
    (= true (validate-number 49927398716)))
  (testing "if a credit card number is not valid"
    (= false (validate-number 79927398710))))
