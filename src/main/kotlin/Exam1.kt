fun main() {
println(findACount("abc",-91))
}


fun findACount(pattern: String, count: Int): String {
    return if (count <= 0) {
        ""
    } else if (count <= pattern.length) {
        pattern.substring(0,count)
    } else {
        val remainChar=count % pattern.length
        println(remainChar)
        pattern.repeat(count / pattern.length).plus(
            if (remainChar>0){
            pattern.substring(0,remainChar)
            }else{
                ""
            }
        )

    }


}