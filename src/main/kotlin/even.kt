fun main(){
    EvenNumber()
}
fun EvenNumber(){
    var list = listOf(1,2,3,4,5,6,7,8,9,10)
    var newlist = list.filter{y -> y % 2 == 0}
    println("newlist : ${newlist}")
    println(listOf(newlist.sum()))
}
