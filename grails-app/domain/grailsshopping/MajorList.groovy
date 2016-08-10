package grailsshopping

import groovy.transform.ToString

@ToString
class MajorList {

    String listName
    Date createdDate

    // TODO: ordering of list items
//    Set listItems = []
//    Set listItems
    static hasMany = [listItems: ListItem]

    static mapping = {
        schema: "majorshopping"
    }

   static constraints = {
    }
}
