(ns buscador.viacep
  (:require [cheshire.core :refer [parse-string]]
            [clj-http.client :as http-client]))

(def api-url "https://viacep.com.br")

(defn monta-endpoint [api-url cep]
  (str api-url"/ws/"cep"/json/"))

(defn busca-cep [cep]
    (parse-string (:body (http-client/get (monta-endpoint api-url cep)))))