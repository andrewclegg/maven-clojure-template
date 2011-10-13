(ns com.nervechannel.test-maven-clojure-template
  (:use com.nervechannel.maven-clojure-template)
  (:use clojure.test))

; Run with mvn clojure:test

(deftest test-hello-world
  (is (= "Hello World" hello))
  (print hello))