import grailsshopping.*

def majorList = new MajorList(listName: "brand new list", listItems: [], createdDate: new Date())
//majorList.save()


majorList.listItems = [new ListItem(itemName: "figure out persistence", createdDate: new Date())]
majorList.save()


println "=========================== MajorList ==========================="
for (list in MajorList.list()) {
    println list
}

println "=========================== ListItem ==========================="
for (item in ListItem.list()) {
    println item
}

