(ns briancain.clj-luhn.core-test
  (:require [clojure.test :refer :all]
            [briancain.clj-luhn.core :refer :all]))

(deftest valid?-test
  (testing "if a credit card number is valid"
    (= true (valid? 49927398716)))
  (testing "if a credit card number is not valid"
    (= false (valid? 79927398710))))

(deftest check-digit-test
  (testing "obtains the check digit from a card"
    (= 3 (check-digit 79927398710))))
