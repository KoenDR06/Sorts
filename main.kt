fun main() {
    val l = 8192

    val arr = mutableListOf(1)
    arr.remove(1)
    for(i in 1 .. l) {
        arr.add(i)
    }

    val start = System.currentTimeMillis()
    quickSort(arr)
    val timeElapsed = System.currentTimeMillis() - start

    println(timeElapsed)
}