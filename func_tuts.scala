import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object func_tuts {
    def main(args: Array[String]){

        def testStatements(){
            var i = 0
            while(i <= 10){
                println(i)
                i += 1
            }        
            do{
                println(i)
                i += 1
            }while(i <= 20)

            for(i <- 1 to 10){
                println(i)
            }

            val myName = "Venkatesh"

            for(i <- 0 until myName.length){
                println(myName(i))
            }

            val myList = List(1,2,3,4,5,6)

            for(i <- myList){
                println("List Item:" + i)
            }

            var evenList = for {i <- 1 to 20 if (i % 2) == 0} yield i
            println(evenList)

            for(i <- 1 to 5; j <- 1 to 5){
                println(i, j)
            }
        }

        def printPrimes(){
            val primeList = List(1,2,3,5,7,11)
            for(i <- primeList){
                if(i == 11){
                    return
                }

                if(i != 1){
                    println(i)
                }
            }
        }

        def numberGuess(){

            var guessNum = 0

            do{
                print("Guess a number: ")
                guessNum = readLine.toInt
            }while(guessNum != 15)

            printf("You guessed the secret number %d\n", 15)
        }

        def formatStrings(){

            val name = "Venkatesh"
            val age = 27
            val weight = 175.5

            println(s"Hello $name")
            println(f"I am ${age + 1} and weight $weight%.2f")

            printf("'%5d'\n", 5)
            printf("'%-5d'\n", 5)
            printf("'%05d'\n", 5)
            printf("'%.5f'\n", 5.0)

            printf("'%5s'\n", "Hi")
            printf("'%-5s'\n", "Hi")
        }

        def stringOperations(){
            var randSent = "Hello World in Scala"
            var randSentAnother = "Python is the best"

            println("3rd index: " + randSent(3))
            println("Sentence length: " + randSent.length)
            println(randSent.concat(" and going towards Spark in Scala"))
            println("Sentence equality: " + randSentAnother.equals(randSent))
            println("Index of string: " + randSentAnother.indexOf("Scala"))
        }

        def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
            return num1 + num2
        }

        def getSumUnit(num1 : Int = 1, num2 : Int = 1) : Unit = {
            num1 + num2
        }

        def getSumMultiple(args : Int*) : Int = {
            var sum : Int = 0
            for(num <- args){
                sum += num
            }
            return sum
        }

        def factorialOf(num : BigInt) : BigInt = {
            if(num <= 1)
                return 1
            else
                return num * factorialOf(num-1)
        }

        def multiplytwo(i : Int) : Unit ={
            println(2*i)
        }

        def arrayOperations(){

            val favNums = new Array[Int](20)
            val friends = Array("Bob", "Tom")
            friends(0) = "Sue"
            println("Best Friends " + friends(0))

            val friends2 = ArrayBuffer[String]()
            friends2.insert(0, "Phil")
            friends2 += "Mark"
            friends2 ++= Array("Susy", "Paul")
            friends2.insert(1, "Mike")
            friends2.remove(1, 2)

            var friend : String = " "

            for(friend <- friends2){
                println(friend)
            }

            for(j <- 0 to (favNums.length -1)){
                favNums(j) = j
            }

            var favNumstimes2 = for(num <- favNums)yield 2*num

            favNumstimes2.foreach(println)
            favNumstimes2.foreach(multiplytwo)

            println(favNums.sum)
            println(favNums.min)
            println(favNums.max)

            val descNums = favNums.sortWith(_>_)
            val ascNums = favNums.sortWith(_<_)

            println(ascNums.mkString(", "))

        }

        def multidimArray(){
            
            var multTable = Array.ofDim[Int](10,10)

            for(i <- 0 to 9; j <- 0 to 9){
                multTable(i)(j) = i*j
            }

            for(i <- 0 to 9; j <- 0 to 9){
                printf("%d x %d = %d\n", i, j, multTable(i)(j))
            }

        }

        def mapDictOps(){

            val employees = Map("Manager" -> "Venkatesh", "Secretary" -> "Penny Hofstader")

            if(employees.contains("Manager")){
                printf("Manager : %s\n", employees("Manager"))
            }

            val customers = collection.mutable.Map(100 -> "Sheldon", 101 -> "Howard", 102 -> "Rajesh")
            printf("Cust 1 : %s\n", customers(100))
            customers(100) = "Amy Farah Fowler"
            customers(103) = "Bernedette"

            for((k, v) <- customers){
                printf("%d : %s\n", k, v)
            }

        }

        def tupleOps(){

            var tupleStuart = (103, "Stuart", 100.0)
            printf("%s owes us $%.2f\n", tupleStuart._2, tupleStuart._3)
            tupleStuart.productIterator.foreach{ i => println(i)}

        }

        tupleOps

    }
}