(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "Solves #5"
    (should= 2520 (euler-5 10))
    ;(should= 232792560 (euler-5 20))

  )
  )

(run-specs)
