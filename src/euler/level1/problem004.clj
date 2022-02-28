(ns euler.level1.problem004)

(defn palindrome? [result]
  (= (seq (str result)) (reverse (str result))))


(defn euler-4 [n cap]
  (loop [n n x n result []]
    (if (< n cap)
      (if (< x cap)
        (recur n (inc x) (conj result (* n x)))
        (recur (inc n) n result))
      (reduce max (filter palindrome? result))
      )

    )
  )
