(ns leiningen.new.mies-om
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "mies-om"))

(defn mies-om [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["index.html" (render "index.html" data)]
      ["README.md" (render "README.md" data)]
      [".gitignore" (render "gitignore" data)])))
