(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "Euler Problem #9"

  (it "Solves #9"
    (should= 31875000 (euler-9 1000.0)))

  (it "Finds c"
    (should= 5.0 (c 3 4)))
  (it "Finds c as integer"
    (should= 5 (c-int 3 4)))

  )

(run-specs)
