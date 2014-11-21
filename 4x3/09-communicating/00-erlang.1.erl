
           {communicating,With,Variants}

   process_action({checkout,Name,Book},Library)
     -> {ok,Book}
     -> {already_checked_out,jneen}
   process_action({return,Book},Library)
     -> {ok,Book}
   process_action({lookup,Book},Library)
     -> {who,jneen}
     -> {not_checked_out,Book}
   process_action({list,Name})
     -> {ok,{"book 1","book 2"}}
   process_action(_, Library)
     -> {err,"unknown action"}


     % example h/t Jesse Farmer at 20bits.com
