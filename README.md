# clj-luhn

A Clojure library designed to validate credit card numbers that use the [Luhn algorithm](http://en.wikipedia.org/wiki/Luhn_algorithm).

## Usage

```clojure
(clj-luhm/valid? 49927398716)
;=> true
(clj-luhm/valid? 79927398710)
;=> false
(clj-luhm/check-digit 79927398710)
;=> 3
```

## Installation

[![Clojars Project](http://clojars.org/clj-luhn/latest-version.svg)](http://clojars.org/clj-luhn)

## License

Copyright © 2015 Brian Cain

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
