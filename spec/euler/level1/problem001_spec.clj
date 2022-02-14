(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "naturals"
    (should= [1 2 3 4 5 6 7 8 9] (naturals 10))
    (should= [1 2 3 4] (naturals 5))
    (should= [1 2] (naturals 3)))

  (it "Multiples of 3 or 5"
    (should= false (multiple-of-3-or-5? 1))
    (should= false (multiple-of-3-or-5? 2))
    (should= true (multiple-of-3-or-5? 3))
    (should= false (multiple-of-3-or-5? 4))
    (should= true (multiple-of-3-or-5? 5)))

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000)))
  )

(run-specs)
