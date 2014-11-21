


                              Modeling OR



           (match item
             [:delivery addr] (str "delivering to " addr)
             [:digital email] (str "emailing to " email)
             [:pickup store]  (str "picking up from store "
                                 (db/query :address store)))


             ; checking the tag and handling all the cases
             ; is the gatekeeper for accessing the data
             ; conveniently


