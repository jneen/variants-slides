

                   Using the data



(case (:type item)
  "delivery" (str "delivering to " (:address item))
  "digital"  (str "emailing to " (:email item))
  "pickup"   (str "picking up from store "
                  (-> item
                      :store-id
                      lookup-store
                      :address)))




