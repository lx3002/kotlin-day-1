fun main(){
    inheritancestring()
}
fun  inheritancestring(){
    println(isinheritace("fiti").toString())
}
fun isinheritace(value:String):Boolean{
    var result: Boolean = true
    for (x in value.length -1 downTo 0){
        if (value[x] != value[value.length -1 - x]){
            result = false
            break
        }
    }
    return result
}