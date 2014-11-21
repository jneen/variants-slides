

        (recursive!) T Y P E S

         * Recursive variants are trees!

    [:app [:lam 'x [:app [:var 'x] [:var 'x]]]
          [:lam 'y [:app [:var 'y] [:var 'y]]]]

             (defalias LCExpr
                (Rec [e]
                   (Variant
                     [:app e e]
                     [:lam Sym e]
                     [:var Sym])))



