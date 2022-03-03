(ns euler.level1.problem007)


(defn square-root [x]
   (Math/sqrt x))

(defn numbers
  ([] (numbers 1))
  ([n] (lazy-seq (cons n (numbers (inc n)))))
  )
;(declare prime-numbers)
;(defn prime-requirements [n]
;(let [max-divisor (square-root n)
;      potentials-divisors (take-while #(< % max-divisor) primes)
;
;      ])
;(first (filter doesnt-have-divisor (iterate inc n)))
;(filter (not (int? (/ n (<  prime-numbers (square-root n)))))))

;(defn prime-numbers
; ([] (prime-numbers 2))
;  ([n] (lazy-seq (cons n (prime-numbers (prime-requirements (inc n))))))
;  )



(defn divisor? [a b]
  (= 0 (rem a b)))

(declare prime-number)

(defn prime? [n]
  (cond (< n 2) false
        (= n 2) true
        :else
    (let [max-divisor (square-root n)
          potential-divisors (drop 2 (range (inc max-divisor)))]
      (not (some #(divisor? n %) potential-divisors)))))


(defn prime-numbers [] (filter prime? (iterate inc 2)))




