(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [org.clojure/clojurescript "0.0-3208"]
                 [org.omcljs/om "0.8.8"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/{{sanitized}}" "out/{{sanitized}}.js"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :main {{name}}.core
                :output-to "out/{{sanitized}}.js"
                :output-dir "out"
                :optimizations :none
                :verbose true}}]})
