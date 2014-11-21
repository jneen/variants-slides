
          [:communicating with variants]

   (defn process-action [action library]
     (match action
       [:checkout name book]
            [:ok book] ; ... or
            [:already-checked-out "jneen"]
       [:return book]
       [:lookup book]
            [:who "jneen"] ; ... or
            [:not-checked-out book]
       [:list name]
            [:ok ["book 1" "book 2"]]
       _ [:error (str "unknown action" action)]))



