(ns clj-utils.fib)

;; A lazy sequence of Fibonacci numbers.
(def fib
  (lazy-cat [0 1]
            (map + (rest fib) fib)))

(defn fib-n
  "The first n Fibonacci numbers."
  [n]
  (take n fib))

(defn fib-below
  "All Fibonacci numbers below n."
  [n]
  (take-while #(< % n) fib))

