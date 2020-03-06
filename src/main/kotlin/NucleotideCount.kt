class Dna(private val input: String) {

    init {
        require(input.all { it in "ACGT" })
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            return "ACGT$input".groupBy { it }.mapValues { it.value.size - 1 }
        }
}
