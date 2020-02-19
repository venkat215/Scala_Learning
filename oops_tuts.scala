import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object oops_tuts {
    def main(args: Array[String]){

        val rover = new Animal("Rover", "Woof")
        println(rover.toString)

        val wolf = new Animal("Wolf", "Howl")
        println(wolf.toString)

        val dog = new Dog("Dog", "Bark", "Growl")
        println(dog.toString)
        println(dog.growl)

        val pom = new Dog("Pom", "Bark")
        println(pom.toString)
        println(pom.growl)

        val superman = new Superhero("Superman")
        println(superman.fly)

    }

    class Animal(var name: String, var sound: String){
        this.setName(name)

        val id = Animal.newIdNum

        def getName() : String = name
        def getSound() : String = sound
        
        def setName(name : String){
            if(!(name.matches(".*\\d+.*"))){
                this.name = name
            }else{
                this.name = "No Name"
            }
        }

        def setSound(sound: String){
            this.sound = sound
        }

        def this(name : String){
            this("No Name", "No Sound")
            this.setName(name)
        }

        def this(){
            this("No Name", "No Sound")
        }

        override def toString(): String = {
            return "%s with the id %d says %s".format(this.name, this.id, this.sound)
        }

    }

    object Animal{
        private var idNumber = 0
        private def newIdNum = {idNumber += 1; idNumber}
    }

    class Dog(name : String, sound: String, var growl: String = "No Growl") extends Animal(name, sound){
            
            def setGrowl(growl: String){
                this.growl = growl
            }

    }

    trait Flyable {
        def fly : String
    }
    
    trait Bulletproof {

        def hitByBullet : String
        
        def ricochet(startSpeed : Double) : String = {
            "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
        }
    }
    
    class Superhero(val name : String) extends Flyable with Bulletproof{
        def fly = "%s flys through the air".format(this.name)
        def hitByBullet = "The bullet bounces off of %s".format(this.name)
    }

}