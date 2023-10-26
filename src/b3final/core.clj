(parse-opts    args    opcoes-do-programa))]





(defn    -main [&    args]
  (let    [{:keys    [de    para]}    (:options (parse-opts    args    opcoes-do-programa))]
    (prn "Cotação:"    (http-client/get    api-url
      {:query-params    {    "q"    (parametrizar-moedas    de    para) "apiKey"    chave}}))
  )
)