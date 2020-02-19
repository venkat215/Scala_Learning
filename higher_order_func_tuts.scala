import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object higher_order_func_tuts {
    def main(args: Array[String]){

        val log10Func = log10 _
        println(log10Func(1000))

        List(1000.0, 10000.0).map(log10Func).foreach(println)
        List(1,2,3,4,5,6).map((x : Int) => x+x).foreach(println)
        List(1,2,3,4,5,6).filter(_ % 2 == 0).foreach(println)

        def times3(num : Int) = num * 3
        def times4(num : Int) = num * 4

        def multiplythem(callback : (Int) => Double, num : Int) = {
            callback(num)
        }

        val divisor = 5
        val divisor5 = (num : Double) => num / divisor
        println(divisor5(1000.0))

    }

}