package grailsshopping

import groovy.transform.ToString

@ToString
class ListItem {
    String itemName
    Date createdDate

    /** Date the item was completed. If null, the item is still active */
    Date completedDate

//    static belongsTo = [majorList: MajorList]

    static mapping = {
        schema: "majorshopping"
    }
    
    static constraints = {
    }
}
