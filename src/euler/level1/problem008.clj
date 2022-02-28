(ns euler.level1.problem008)

(defn separate [n]
  (->> n str (map (comp read-string str))))

(defn euler-8 [n]
  (loop [n (separate n) result []]
    (if (< (count result) 1000)
      ;(println (count result) (println result))
      (recur (rest n) (conj result (apply * (take 13 n))))
      (reduce max result))
    ))
