(ns djson
  (:require [clojure.data.json :as json]
            [clojure.java.io :refer [writer] :as io]))


(with-open [wrtr (writer "/home/devinkin/test.json" :append true)]
  (.write wrtr (str (json/write-str {:a 1 :b 2}) "\n"))
  (.write wrtr (json/write-str {:a 1 :b 2}))
  )
