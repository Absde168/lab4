fun main() {
    val numbers = listOf(1, 3, 2, 5, 4, 7, 6)

    val result = mutableListOf<Int>()
    for (i in 1 until numbers.size) {
        if (numbers[i] > numbers[i - 1]) {
            result.add(numbers[i])
        }
    }

    println(result)
}
