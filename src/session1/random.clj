(ns session1.random)

(defn random-egs
  []
  (rand)
  (defn roll-d6 []
    (inc (rand-int 6)))
  (println (roll-d6))
  (println (roll-d6))
  (println (rand-nth [1 2 3]))
  (comment This won’t work for sets or hash maps, however. If you want to retrieve a random element
           from a nonsequential collection like a set, use seq to transform that collection into a
           sequence before calling rand-nth on it)

  (println (rand-nth (seq #{:heads :tails})))
  (println (shuffle [1 2 3 4 5 6]))
  (defn now [] (java.util.Date.))
  (def one-second-ago (now))
  (Thread/sleep 1000)
  ;; Now is greater than (1) one second ago.
  (println (compare (now) one-second-ago))
  ;; -> 1
  ;; One second ago is less than (-1) now.
  (println (compare one-second-ago (now)))
  ;; -> -1
  ;; "Equal" manifests as 0.
  (println (compare one-second-ago one-second-ago))
  ;; -> 0

  )
