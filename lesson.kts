/**
 * 1. Для двух значений типа int верните их сумму. Если два значения не совпадают, верните их сумму в два раза.
Пример:
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */

@Test
fun sumDouble() {
    val x = 1
    val y = 2
    var res: Int = x + y
    if (x == y) {
        res = (x + y) * 2
        println(res)
    }
    assertEquals(3, res)
}

/**
2. Дано два целых числа, a и b, верните true, если их сумма равна 10 или false если нет.
Пример:
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */

@Test
fun makes10() {
    oneSum(9, 10)
}

fun oneSum(a: Int, b: Int) {
    val res = a + b == 10
    assertEquals(false, res)
}

/**
 * 3. Дана не пустуя строка и int n, верните новую строку, в которой char с индексом n был удален.
Пример:
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */

@Test
fun someChar() {
    val someWord = "kitten"
    var n: Int = 1

    if (n < someWord.length) {
        someWord.forEachIndexed { index, c ->
            if (index == n) {
            }
        }
        val res = someWord.removeRange(n, n + 1)
        assertEquals("itten", res)
    }
}

/**
 * 4. Для заданного int n верните true, если оно находится в пределах 10 от 100 или 200.
Пример:
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

@Test
fun nearHundred() {
    val n = 89
    val res = if (n in 91..109) {
        true
    } else n in 191..209
    assertEquals(false, res)
}

/**
 * 5.Верните true, если данная строка начинается с «mix», за исключением того, что «m» может быть любым, поэтому «pix», «9ix»… все учитываются.
Пример:
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

 */

@Test
fun mixStart() {
    val start = "mix snacks"
    var res = false

    if (start.length >= 3) {
        val r1 = start.substring(1, 3)
        val finish = "mix".substring(1, 3)

        if (r1.length >= finish.length) {
            res = r1 == finish
        }
    }

    assertEquals(true, res)
}

/**
6. Дано две температуры, верни true, если одна меньше 0, а другая больше 100.
Пример:
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false */

@Test
fun main () {
    val tempStart: Int = 10
    val tempFinish: Int = 130
    var res = false

    if (tempStart < 0 && tempFinish > 100) {
        res = true
        println(res)



    } else  {
        println(res)
    }

}
/** 7. Дана строка, вернуть новую строку, в которой были заменены первый и последний символы.
Пример:
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba" */

fun main () {
    var prevResult = "abcde"
    var tmp = prevResult[0]
    var builder = StringBuilder()
    for (i in 0..prevResult.length - 2) {
        builder.append(prevResult[i+1]) }
    builder.append(tmp)
}

/**8. Дано три значения int, a b c, верните наибольшее.
Пример:
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3*/

@Test
fun main(args: Array<String>){
    val one = arrayOf(1, 2, 3)
    var res = one[0]
    for(i = 0, i < one.length, i++){
        if(one < i){
            res = one[i]
            println(res)
        }
    }
}

/**9. Дано два неотрицательных значения int, верните true, если они имеют одинаковую последнюю цифру, например, 27 и 57.
Пример:
lastDigit(27, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true*/

fun main(){
    var x = 27
    var y = 17
    var resx = x % 10
    var resy = y % 10
    if(resx == resy)true else false
}


/**10. Для данной строки вернуть новую строку, в которой последние 3 символа теперь в верхнем регистре. Если в строке меньше 3-х символов, сделать всю строку в верхнем регистре.
Пример:
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/

fun String.invertCase(): String {
    val array = this.toCharArray()
    this.forEachIndexed { index, char ->
        when {
            char.isUpperCase() -> array[index] = char.toLowerCase()
            char.isLowerCase() -> array[index] = char.toUpperCase()
        }
    }
    return String(array)
}

val input = ""
println(input.invertCase())

