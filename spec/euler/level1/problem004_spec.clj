(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "paindrome?"
    (should= true (palindrome? 1))
    (should= false (palindrome? 122))
    (should= true (palindrome? 22)))


  (it "Solves #4"
    (should= 9009 (euler-4 10 100))
    (should= 906609 (euler-4 100 1000)))
  )

(run-specs)
