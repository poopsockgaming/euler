(ns euler.level1.problem009)
; check for all pythagorean equations that work
; only take out the one where a+b+c = 1000

(defn c [a b]
  (Math/sqrt (+ (* a a) (* b b))))

(defn c-int [a b]
  (int (Math/sqrt (+ (* a a) (* b b)))))

(defn euler-9 [end-product]
  (loop [a 1 b 1 result []]
    (if (< a end-product)
      (if (< b end-product)
        (if (= end-product (+ a b (c a b)))
          (recur a (inc b) (conj result a b (c-int a b)))
          (recur a (inc b) result))
        (recur (inc a) 1 result))
      (apply * (take 3 result)))))