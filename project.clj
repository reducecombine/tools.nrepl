;; Please don't bump the library version by hand - use ci.release-workflow instead.
(defproject org.clojure/tools.nrepl "1.100.0"
  ;; Please keep the dependencies sorted a-z.
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.logging "0.2.3"]]

  :description "fork."

  :url "https://github.com/reducecombine/.lein"

  :min-lein-version "2.0.0"

  :license {:name "EPL-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :target-path "target/%s"

  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]

  :monkeypatch-clojure-test false

  :plugins [[lein-pprint "1.1.2"]])
