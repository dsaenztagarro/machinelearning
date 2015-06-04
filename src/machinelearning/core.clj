(ns machinelearning.core
  (:use clojure.core.matrix)
  (:require [clatrix.core :as cl])
  (:gen-class))

(def A (cl/matrix [[0 1 2] [3 4 5]]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
