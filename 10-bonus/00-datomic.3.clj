
                    Storing variant values in datomic
                              (the schema)


                    { :db/id #db/id[:db.part/db]
                      :db/ident :gb/order }

                    { :db/id #db/id[:db.part/db]
                      :db/ident :gb.order/delivery
                      :db/valueType :db.valueType/string
                      :db/cardinality :db.cardinality/one
                      :db.install/_attribute :db.part/db
                      :db/_variants :gb/order }

                    ; ...



