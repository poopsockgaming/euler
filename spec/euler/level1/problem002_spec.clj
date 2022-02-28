(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2


(describe "Euler Problem #2"

  (it "fibonacci sequence"
    (should= [1 1 2 3 5 8] (take 6 (fibonacci)))
    )

  (it "Solves #2"
    (should= 10 (euler-2 10))
    (should= 4613732 (euler-2 4000000)))
  )
 (run-specs)
