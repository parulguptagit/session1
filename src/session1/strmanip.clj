(ns session1.strmanip
  (:require [clojure.string :as str]))

(defn str-manip-egs
  []
  (
    ;;comment
    ;;converting String to uppercase
    ;;lowercase and
    ;;capitalizing first letter
    )
  (println "************** converting string to uppercase, lowercase **********************************")
  (println (str/upper-case "converting string to uppercase."))

  (println (str/lower-case "CONVERTING TO LOWER CASE"))

  (println (str/capitalize "capitalizing first letter of the string"))

  (comment
    ;;cleaning up whitespaces in the string
    ;;trim helps in eliminating the whitespaces at the beginning and at the end of the line
    ;; triml helps in eliminating the whitespace from left side of the string
    ;; trimr helps in eliminating the whitespace from right end of the string
    )
  (println "************** eliminating whitespaces at the start and at end of a string********************")
  (println (clojure.string/trim "\teliminating the whitespaces\t") )
  (println (clojure.string/triml "\teliminating the whitespaces\t") )
  (println (clojure.string/trimr "\teliminating the whitespaces\t") )

  (comment
    ;; #"pattern" syntax helps significantly, because it lets
    ;; us avoid the requirement to escape every \ character with another \ character
    ;;"\t\" -> tab, "\n\" -> newline, "\r\" -> carriage return, "\f" -> line feed, " \x0B" -> vertical tab are considered as whitespaces in clojure
    ;;\d + # -> retrieves one or more digits
    ;; \s+ # -> eliminates white spaces
    ;; \S+ # -> eliminates all non-white spaces
    )
  (println "************** eliminating all the whitespaces in a string************************************")
  (println (clojure.string/replace " how\t\nto eliminate \tall the whitespaces \tin the string" #"\s+" " "))

  (comment
    ;;when you dont want to write clojure.string everytime you use the string function you can replace it with below function
    ;;[require '[clojure.string :as str]]
    )
  (println "************** replacing clojure.string with str and replace a string in a string***************")
  (println (str/replace "Hello welcome, and world" "world" "thanks for your time"))
  (comment
    ;; concatenating multiple strings into one string
    )
  (println "************** concatenating strings************************************************************")
  (println (str "Example" " " "method" " " "of concatenating strings"))

  (comment
    ;; join is used to concatenate simple strings separated by a comma called as separator
    )
  (println "************** concatenating strings using join ************************************************************")
  (def animals ["lion" "tiger" "deer" "elephant"])
  (println (str/join "," animals)))
