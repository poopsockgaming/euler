(ns euler.level1.problem002)

(defn lazy-fibonacci [n x]
  (lazy-seq (cons (+ n x) (lazy-fibonacci x (+ n x)))))

(defn fibonacci [] (concat [1 1] (lazy-fibonacci 1 1)))

(defn euler-2 [max]
  (apply + (filter even? (take-while #(< % max) (fibonacci))))
  #_(loop [n 1 x 2 result [1 2]]
    (if (< x max)
      (recur x (+ n x) (conj result (+ n x)))
      (apply + (filter even? result )))))


