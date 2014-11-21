


                         What even are variants?

                       + Variants are tagged data

                       + Capable of branching and
                         destructuring


                 (match thing
                   [:tag data] (do-something-with data)
                   [:other-tag data more-data]
                        (do-something-with data more-data))




