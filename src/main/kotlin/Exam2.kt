fun main() {
    println(findMinRemovable("ABABA"))
}

fun findMinRemovable(inputString: String): Int {
    if (inputString.isEmpty()) {
        return 0
    }
    val firstChar = inputString[0]
    val replace = if (firstChar == 'A') {
        "AB"
    } else {
        "BA"
    }
    return inputString.replace(replace, "").length
}