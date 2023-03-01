(ns buscador.core
  (:require [buscador.viacep :refer [busca-cep]]
            [buscador.interpretador-de-opcoes :refer 
              [interpretar-opcoes]]))

(defn -main
  [& args]
  (let [{:keys [cep]} (interpretar-opcoes args)]
    (-> (busca-cep cep)
        (prn))))