fun main() {
 	
    val pair=Pair(1.0,'C')
    println(pair.first)
    println(pair.second)
    
    val(first, second) = pair
    println(first)
    println(second)
    
    
    val triple=Triple('a',2,'b')
    
    val (f,s,t)=triple
    println(f)
    println(s)
    println(t)
    
    
    println(triple.first)
    println(triple.second)
    println(triple.third)
}