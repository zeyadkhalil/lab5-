Q4)
import java.io.File
fun main() {
  
val fileName = "/Users/Zeyad/Desktop/hello.txt"
val content = File(fileName).readText()
  
println(content)
}