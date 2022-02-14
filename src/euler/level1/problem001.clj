(ns euler.level1.problem001)

(defn naturals [x]
  (rest (range x)))

(defn multiple-of-3-or-5? [x]
  (or (zero? (rem x 3))
      (zero? (rem x 5))))

(defn euler-1 [n]
  (apply + (filter multiple-of-3-or-5? (naturals n)))
  )
