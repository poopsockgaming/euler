(ns euler.level1.problem003)

(defn euler-3 [n]
  (loop [f 2 n n result []]
    (if (< n 2)
      (last result)
      (if (zero? (rem n f))
        (recur f (/ n f) (conj result f))
        (recur (inc f) n result)))))

(defn factors [n]
  (loop [f 2 n n result []]
    (if (< n 2)
      result
      (if (zero? (rem n f))
        (recur f (/ n f) (conj result f))
        (recur (inc f) n result)))))