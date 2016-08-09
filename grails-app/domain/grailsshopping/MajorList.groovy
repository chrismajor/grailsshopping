package grailsshopping

class MajorList {

    String listNameWHAT
    Date createdDate

    // TODO: ordering of list items
    Set listItems = []
    static hasMany = [listItems: ListItem]

    static mapping = {
        schema: "majorshopping"
    }

   static constraints = {
    }
}
