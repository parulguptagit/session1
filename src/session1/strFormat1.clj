(ns session1.strFormat1)

(defn strFormategs
  []
  ;The quickest method for formatting values into a string is the str function:
  (def me {:first-name "Ryan", :favorite-language "Clojure"})
  (println  (str "My name is " (:first-name me)
       ", and I really like to program in " (:favorite-language me)))


  ;For greater control over how values are printed, use the format function
  (defn filename [name i]
    (println  (format "%03d-%s" i name)));
  (filename "my-awesome-file.txt" 42)


  ;clojure.string/split to split a string into a vector of tokens.
  (println  (clojure.string/split "HEADER1,HEADER2,HEADER3" #","))
  (println (clojure.string/split "This is my first Session on Clojure" #" "))

  (println  (symbol "valid?")) ;;To convert from a string to a symbol, use the symbol function:
  (println (str 'valid?) )    ;;To convert from a symbol to a string, use str:
  (println (name :triumph))
  (println (str :triumph))
  (println (keyword "fantastic"))
  )
