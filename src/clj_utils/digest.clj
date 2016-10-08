(ns clj-utils.digest
  (:require [digest :as d]))

(defn md5-string
  "Calculate the MD5 digest of string, s."
  [s]
  (d/md5 s))
