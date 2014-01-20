(ns {{name}}.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(defn app-state {:text "Hello world!"})

(om/root
  app-state
  (fn [app owner]
    (dom/h1 nil (:text app)))
  (. js/document (getElementById "app")))
