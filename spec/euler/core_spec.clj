(ns euler.core_spec
  (:require
    [speclj.core :refer :all]
    [euler.core :refer :all]))

(describe "Core"

  (it "separates digits of a number"
    (should= [1] (digits 1))
    (should= [1 2] (digits 12))
    (should= [1 2 3] (digits 123))
    (should= [1 2 3 4] (digits 1234))
    (should= [9 8 7 6] (digits 9876)))

  (it "str->n"
    (should= 21 (s->i "021"))
    )

  )