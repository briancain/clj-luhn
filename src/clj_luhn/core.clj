(ns clj-luhn.core)

(defn expand-to-digits
  "Takes a number like 12345 and returns a vector [1 2 3 4 5]"
  [number]
  (vec (map #(Character/digit % 10)  (str number))))

(defn product-or-double
  "Returns double of product unless number > 9 (in which it returns the num of the two digits in its product"
  [number]
  (let [number-double (* number 2)]
    (if (> number-double 9)
      (reduce + (expand-to-digits number-double))
      number-double)))

(defn double-every-other
  "Doubles every other number in the card sequence"
  [ccn]
  (map-indexed
    #(if (zero? (mod (inc %1 ) 2))
       (product-or-double %2)
       %2)
    ccn))

(defn validate-number
  "Validates a given credit card number using the Luhn Algorithm"
  [ccn]
  (let [expanded-ccn (expand-to-digits ccn)
        ccn-seq (double-every-other expanded-ccn)
        ccn-sum (reduce + ccn-seq)
        mod10-ans (mod ccn-sum 10) ]
    (= mod10-ans 0)))
