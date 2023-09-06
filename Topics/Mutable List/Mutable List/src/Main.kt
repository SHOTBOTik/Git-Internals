
fun names(namesList: List<String>): List<String> {
    var count = 0
    val nameCount = mutableListOf<String>()
    for(i in 0..namesList.distinct().size-1) {
        for(elements in namesList) if (namesList.distinct()[i] == elements) count++
        nameCount.add("The name ${namesList.distinct()[i]} is repeated $count times")
        count = 0
    }
    return nameCount.toList()
}
