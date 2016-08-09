import grailsshopping.*

// def listItems = [new ListItem(itemName: "figure out persistence", createdDate: new Date())]

def majorList = new MajorList(listName: "brand new list", listItems: [new ListItem(itemName: "figure out persistence", createdDate: new Date())], createdDate: new Date())
majorList.save()