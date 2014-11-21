
        Storing variant values in datomic
                ; ~*~ TODO ~*~ ;

        * Schema support

      { :db/id #db/id[:db.part/db]
        :db/ident :gb.user/orders
        :db.install/_attribute :db.part/db

        ; these would be handy:
        :db/valueType :db.valueType/variant
        :db/valueVariant :gb/order }

        * Enforce that exactly one variant
          attribute gets defined


