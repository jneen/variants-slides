
                    [:communicating with variants]

            (defn process-action [action library]
              (match action
                [:checkout name book] ...
                [:return book] ...
                [:lookup book] ...
                [:list name]
                _ [:error (str "unknown action" action)]))









