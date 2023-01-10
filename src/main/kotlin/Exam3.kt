import java.util.*

fun main(){
    println(minSwaps(intArrayOf(7,1,3,2,4,5,6)))
}

fun minSwaps(inputArray: IntArray): Int {
    val length = inputArray.size
    val map = HashMap<Int, Int>()
    for (i in 0 until length) map[inputArray[i]] = i
    Arrays.sort(inputArray)
    val visited = BooleanArray(length)
    Arrays.fill(visited, false)

    var swapCount = 0
    for (i in 0 until length) {

        if (visited[i] || map[inputArray[i]] == i) continue
        var j = i
        var cycleSize = 0
        while (!visited[j]) {
            visited[j] = true
            j = map[inputArray[j]]!!
            cycleSize++
        }
        if (cycleSize > 0) {
            swapCount += cycleSize - 1
        }
    }
    return swapCount
}