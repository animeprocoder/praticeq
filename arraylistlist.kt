fun main(){
    var animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    println(animals)
    println(animals.add("panda bear"))
    println(animals)
    println(animals.remove("lion"))
    println(animals)
//    println(animals.containsAll("elephants", "girrafe"))
    val contains = arrayListOf("elephants", "giraffe")
    println(animals.containsAll(contains))
}
