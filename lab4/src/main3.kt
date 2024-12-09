fun main() {
    val n = 5

    val votes = listOf(
        "Lexa 10",
        "Rusya 15",
        "Sokol 5",
        "Smirnov 20",
        "Xomyak 10"
    )

    val electionResults = mutableMapOf<String, Int>()

    for (entry in votes) {
        val (candidate, voteCount) = entry.split(" ")
        val vote = voteCount.toInt()

        electionResults[candidate] = electionResults.getOrDefault(candidate, 0) + vote
    }

    for (candidate in electionResults.keys.sorted()) {
        println("$candidate: ${electionResults[candidate]}")
    }
}
