//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(mergeSort(listOf(8, 3, 5, 4, 7, 6, 1, 2)))

    val left = listOf(3, 8)
    val right = listOf(4, 5)

    println(merge(left, right))
}

private fun mergeSort(values: List<Int>): List<Int> {
    if (values.isEmpty()) return emptyList()
    if (values.size == 1) return values

    return listOf()
}

private fun merge(
    left: List<Int>,
    right: List<Int>
): List<Int> {
    val newLeft = mutableListOf<Int>()
    val newRight = mutableListOf<Int>()

    for (i in left.indices) {
        if (left[i] < left[i+1]) newLeft.add(left[i])
    }

    for (i in right.indices - 1) {
        if (right[i] < right[i+1]) newRight.add(right[i])
    }


    return newLeft+newRight
}