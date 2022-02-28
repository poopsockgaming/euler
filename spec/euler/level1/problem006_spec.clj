(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "Solves #6"
    (should= 25164150 (euler-6)))
  (it "Tests 6"
    (should= 2640 (test)))
  (it "Tests 6"
    (should=  25502500 (square-of-sum)))
  )


(run-specs)
