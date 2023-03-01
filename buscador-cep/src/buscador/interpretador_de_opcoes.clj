(ns buscador.interpretador-de-opcoes
  (:require [clojure.tools.cli :refer [parse-opts]]))

(def opcoes-do-programa
  [["-c" "--cep cep"
    :default "01001000"]])

(defn interpretar-opcoes [argumentos]
    (:options (parse-opts argumentos opcoes-do-programa)))