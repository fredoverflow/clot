(ns core
  (:gen-class))

(defn -main [& args]
  (println "Hello from Clojure!")
  (run! println args))

(defn square [x]
  (* x x))
