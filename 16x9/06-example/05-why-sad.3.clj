



                      Why does this make me sad?

                          { :address nil
                            :email nil
                            :store-id nil }

                          { :address "123 Main St."
                            :email nil
                            :store-id 12 }

                (-> item :store-id db/find-store :address)





