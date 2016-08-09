package grailsshopping

class ListItem {
    String itemName
    Date createdDate

    /** Date the item was completed. If null, the item is still active */
    Date completedDate

    static mapping = {
        schema: "majorshopping"
    }
    
    static constraints = {
    }
}
