(ns cli-filter-tests.b
  (:require
   [lazytest.core :refer [defdescribe expect it]]))

(defdescribe b-1-test
  (it "works"
    (expect (+ 10 20))))

(defdescribe b-2-test
  (it "works"
    (expect (+ 10 20))))

(defdescribe b-3-test
  (it "works"
    (expect (+ 10 20))))
