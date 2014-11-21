


                  (recursive!) T Y P E S

                   * Recursive variants are trees!

                [:app [:lam 'x [:app [:var 'x] [:var 'x]]]
                      [:lam 'y [:app [:var 'y] [:var 'y]]]]

               (defn eval-lc [expr :- LCExpr] :- LCExpr
                 (match expr
                   [:app fn arg]
                     (match (eval-lc fn)
                        [:lam arg-name body]
                          (recur (subst arg-name arg body))
                        result [:app result arg])
                   _ expr))

