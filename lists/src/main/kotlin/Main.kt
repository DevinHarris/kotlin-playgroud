fun main() {

    val readOnlyList: List<String> = listOf("Devin", "Cole", "Brec")

    println("The last name in the list is ${readOnlyList.last()}")

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    shapes.add("trapezoid")

    println(shapes)
}