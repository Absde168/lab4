fun main() {
    val list1 = setOf(1, 2, 3, 4, 5)
    val list2 = setOf(3, 4, 5, 6, 7)

    val commonNumbers = list1 intersect list2
    
    println(commonNumbers.sorted())
}
