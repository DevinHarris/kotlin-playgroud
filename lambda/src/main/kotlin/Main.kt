fun main() {

    val listOfNames: MutableList<String> = mutableListOf("devin", "kyler", "chance")

    val listToUpperCase = { string: String -> string.uppercase() }

    val updatedList = listOfNames.map { name -> listToUpperCase(name) }

    println(updatedList)
}