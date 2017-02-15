(ns resize.core
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/frame-rate 1))

(defn draw-state [state]
  (q/background-image (q/load-image "clojure.png")))

(q/defsketch resize
  :title "You spin my circle right round"
  :size [220 220]
  :setup setup
  :draw draw-state
  :features [:keep-on-top]
  :middleware [m/fun-mode])
