package lotto.model

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
        require(numbers.size == numbers.distinct().size) { "[ERROR] 로또 번호는 중복되지 않아야 합니다." }
        numbers.forEach { require(it in 1..45) { "[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다." } }
    }

    fun sort(): List<Int> {
        return numbers.sorted()
    }
}
