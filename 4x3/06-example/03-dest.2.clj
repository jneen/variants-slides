

                   Using the data



(case (:type item)
  "delivery" (str "delivering to " (:address item))
  "digital"  (str "emailing to " (:email item))
  ...)








