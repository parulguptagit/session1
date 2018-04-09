(ns session1.core
  ( require [session1.strFormat1 :as strf1]
            [session1.findstr :as findstr]
            [session1.strmanip :as strmanip]
            [session1.random :as random])

  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (strf1/strFormategs)
  (findstr/findegs)
  (strmanip/str-manip-egs)
  (random/random-egs)
  )
