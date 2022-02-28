(ns euler.level1.problem006)

(defn euler-6 []
  (loop [n 1 squares []]
    (if (< n 101)
      (recur (inc n) (conj squares (* n n)))
      (let [sum (apply + (range 101))]
        (- (* sum sum) (apply + squares)))
      )
    )
  )

(defn test []
  (loop [n 1 squares []]
    (if (< n 11)
      (recur (inc n) (conj squares (* n n)))
      (let [sum (apply + (range 11))]
        (- (* sum sum) (apply + squares)))
      )
    )
  )

(defn square-of-sum []
  (let [sum (apply + (range 101))]
  (* sum sum)))