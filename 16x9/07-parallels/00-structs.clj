


      Structs, or, AND structures  |   Variants, or, OR structures
                                   |
 * One constructor                 | * Multiple constructors
     { :key1 val1, :key2 val2 }    |     [:tag1 val1]
                                   |     [:tag2 val2]
                                   |
 * Multiple destructors            | * one destructor
     (:key1 thing)                 |    (match thing
     (:key2 thing)                 |      [:tag1 val1] ...  
                                   |      [:tag2 val2] ...) 
                                   |
 * "Products"                      | * "Sums"




