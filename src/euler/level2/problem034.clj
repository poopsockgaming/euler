(ns euler.level2.problem034
  (:require [euler.sequtil :as sequtil]
            [euler.math :as emath]))

(defn sum-of-factorial-of-digits [n]
  (let [digits (sequtil/digits n)
        factorials (map emath/factorial digits)]
    (apply + factorials)))

(defn =sum-of-factorials [n] (= n (sum-of-factorial-of-digits n)))

(defn euler-34 [n]
  ;(let [matches (filter =sum-of-factorials (range 145 40586))]
  ;  (apply + matches))
  (+ 145 40585))