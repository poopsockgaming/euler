(ns euler.level1.problem008)

(def ->int {\0 0
            \1 1
            \2 2
            \3 3
            \4 4
            \5 5
            \6 6
            \7 7
            \8 8
            \9 9})

(defn separate [n]
  (map ->int (str n)))

(defn euler-8 [x n]
  (let [length-of-number (- (count (str n)) (dec x))]
    (loop [digits (separate n) result []]
      (if (< (count result) length-of-number)
        ;(println (count result) (println result))
        (recur (rest digits) (conj result (apply * (take x digits))))
        (do
          ;(prn result)
          (reduce max result))))))

(defn euler-8 [group-size n]
  (let [digits (separate n)
        combos (partition group-size 1 digits)
        products (map #(apply * %) combos)]
    (apply max products)))
