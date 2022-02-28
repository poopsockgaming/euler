(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "Solves #3"
    (should= 6857 (euler-3 600851475143)))
  (it "Gives factors for 0"
    (should= [] (factors 0)))
  (it "Gives factors for 1"
    (should= [] (factors 1)))
  (it "Gives factors for 2"
    (should= [2] (factors 2)))
  (it "Gives factors for 3"
    (should= [3] (factors 3)))
  (it "Gives factors for 4"
    (should= [2 2] (factors 4)))
  (it "Gives factors for 5"
    (should= [5] (factors 5)))
  (it "Gives factors for 6"
    (should= [2 3] (factors 6)))
  (it "Gives factors for 7"
    (should= [7] (factors 7)))
  (it "Gives factors for 8"
    (should= [2 2 2] (factors 8)))
  (it "Gives factors for 9"
    (should= [3 3] (factors 9)))
  )

(run-specs)
