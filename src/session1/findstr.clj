(ns session1.findstr)


(defn findegs
  []
  ;CookBook 1.7 - searching a string by pattern.

  ;use re-find to check a string for the presence of pattern
  (println (re-find #"Clojure" "THis is Clojure project"))  ;prints Clojure
  (println (re-find #"clojure" "THis is Clojure project"))  ;prints nil
  (println (re-find #"\d+" "Temperature is 451 Fahrenheit" ) )

  ;use re-matches to check for entire stirng to match the pattern
  (println (re-find #"\w+" "my-param"))
  (println (re-matches #"\w+" "my-param"))
  (println (re-matches #"\w+" "justLetters"))

  ;Documentation to check for all the available regex syntax
  ;https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html


  ;Cookbook 1.8 - Pulling values out of string using reg expr

  ;re-seq will return the sequence of successive matchers
  (println (re-seq #"\w+" "My Favorite Things"))
  (println (re-seq #"\w+" "My-Favorite Things"))
  (println (re-seq #"\d{3}-\d{4}" "My phone number is 555-1234."))


  ;; Extract all of the Twitter usernames and hashtags in a tweet
  ;;When given a matching groups, re-seq will print the vector instead of flat strings.
  (defn mentions [tweet]
    (re-seq #"(@|#)(\w+)" tweet))

  (println (mentions "So long, @earth, and thanks for all the #fish. #goodbyes"))


  ;; Using re-seq to capture and decompose a phone number and its title
  (def re-phone-number #"(\w+): \((\d{3})\) (\d{3}-\d{4})")

  (print (re-seq re-phone-number "Home: (919) 555-1234, Work: (191) 555-1234")))

