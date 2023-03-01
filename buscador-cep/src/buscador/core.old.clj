(ns buscador.core.old
  (:require [clojure.tools.cli :refer [parse-opts]]
            [cheshire.core :refer [parse-string]]
            [clj-http.client :as http-client])
  (:gen-class))

(def opcoes-do-programa
  [["-c" "--cep cep"
    :default "01001000"]])

(def api-url "https://viacep.com.br")

(defn monta-endpoint [api-url cep]
  (str api-url"/ws/"cep"/json/"))

(defn -main
  [& args]
  (let [{:keys [cep]} (:options
                        (parse-opts args opcoes-do-programa))]

    (prn "Endereço: " (parse-string (:body (http-client/get (monta-endpoint api-url cep)))))))