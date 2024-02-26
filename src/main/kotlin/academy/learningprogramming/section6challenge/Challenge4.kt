package academy.learningprogramming.section6challenge

fun main() {

    // 1
    val step5Range = 5..5000 step 5
    step5Range.forEach{ println(it) }

    // 2
    val negativeRange = -500..0
    negativeRange.forEach{ println(it) }

    // 3
    var first = 0
    var second = 1

    println(first)
    val fibonacciRange = 1..14 step second
    fibonacciRange.forEach {
        println(second)
        second += first
        first = second - first
    }

    // 4
    for (i in 1..5) {
        println(i)
        if (i == 2) break
        secondLoop@
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo  90) {
                println(k)
                if (k == 98) break@secondLoop
            }
        }
    }

    //5
    val num = 111
    val dnum =
        when {
            num > 100 -> -234.567
            num < 100 -> 4444.555
            else -> 0.0
        }

    println(dnum)
}