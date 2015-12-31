(ns test.a
  (:require [async-ui.forml :refer :all]
            [async-ui.core :as v]
            [async-ui.javafx.tk :as javafx]
            [clojure.pprint :refer [pprint]]
            [clojure.java.io :as io]))

(defn a-view []
  (let [spec (panel "panel" :components
                    [(label "a")
                     (button "b")])]
    (pprint spec)
    (v/make-view "a-view" spec)))


(spit (io/file "a.out.clj")
      (with-out-str
        (pprint (a-view))))