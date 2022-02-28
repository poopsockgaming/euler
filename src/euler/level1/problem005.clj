(ns euler.level1.problem005)


(defn euler-5 [n]
  (let [divisors (range 1 (inc n))]
    (first (filter (fn [n] (every? #(zero? (rem n %)) divisors)) (map inc (range))))))

