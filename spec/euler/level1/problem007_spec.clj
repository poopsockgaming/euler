(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "divisor?"
    (should= true (divisor? 6 3))
    (should= true (divisor? 6 2))
    (should= false (divisor? 6 4)))

  (it "prime?"
    (should= false (prime? 1))
    (should= true (prime? 2))
    (should= true (prime? 3))
    ;(should= false (prime? 4))
    (should= true (prime? 5))
    (should= false (prime? 6)))

  (it "prime? 9"
    (should= false (prime? 9))
    )

  (it "Finds square root"
    (should= 4.0 (square-root 16) 0.002))
  (it "Makes list of numbers"
    (should= [1 2 3 4 5] (take 5 (numbers))))
  (it "Gets prime numbers"
    (should= 104743 (apply max (take 10001 (prime-numbers)))))
)
(run-specs)
