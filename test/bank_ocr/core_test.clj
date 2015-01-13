(ns bank-ocr.core-test
  (:require [clojure.test :refer :all]
            [bank-ocr.core :refer :all]))

(deftest parsing-digits
  (testing "should parse 0"
    (is (= (parse-digit [" _ "
                         "| |"
                         "|_|"]) 0)))
  (testing "should parse 1"
    (is (= (parse-digit ["   "
                         "  |"
                         "  |"]) 1))))