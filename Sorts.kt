fun bubbleSort(arr: MutableList<Int>) : MutableList<Int> {
    for(p in 0 .. arr.size - 2) {
        for(i in 0 .. arr.size - 2) {
            if (arr[i] >= arr[i + 1]) {
                val temp = arr[i + 1]
                arr[i + 1] = arr[i]
                arr[i] = temp
            }
        }
    }
    return arr
}

fun quickSort(arr: MutableList<Int>) : MutableList<Int> {
    if (arr.size > 1) {
        val pivot = arr[0]
        var lower = mutableListOf<Int>()
        var higher = mutableListOf<Int>()
        for(item in arr) {
            if (item < pivot) {
                lower.add(item)
            }
            else if (item > pivot) {
                higher.add(item)
            }
        }
        lower = quickSort(lower)
        println(higher)
        println(lower)
        println("-------")
        higher = quickSort(higher)
        return (quickSort(lower) + listOf(pivot) + higher).toMutableList()
    }
    else return arr


}