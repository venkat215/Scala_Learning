import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object file_io_tuts {
    def main(args: Array[String]){

        val writer = new PrintWriter("test.txt")
        writer.write("Hello World")
        writer.close()

        var reader = Source.fromFile("test.txt", "UTF-8")
        var lines = reader.getLines

        for(l <- lines){
            println(l)
        }

        reader.close()

        try{
            var reader = Source.fromFile("text.txt", "UTF-8")
            var lines = reader.getLines

            for(l <- lines){
            println(l)
            }

            reader.close()
        }catch{
            case ex: Exception => println(ex.getClass)
        }finally{
            println("GoodBye")
        }


    }

}