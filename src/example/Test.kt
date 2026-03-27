package example

class Temperature {
    var celsius: Double = 0.0
        set(value) {
            if (value >= -273.15) field = value
        }
    val fahrenheit: Double
        get() = celsius * 9 / 5 + 32
}

data class Item(val id: Int, val name: String, val quantity: Int) {
    override fun toString(): String {
        return "Item #$id: $name (qty: $quantity)"
    }
}

abstract class Human {
    abstract val age: Int
    abstract fun hello()
    fun greet() {
        println("I am a human")
    }
}

class Person(override val age: Int) : Human() {
    override fun hello() {
        println("Hello, I am a Person, age: $age")
    }
}

class Student(override val age: Int) : Human() {
    override fun hello() {
        println("Hello, I am a Student, age: $age")
    }
}

abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area() = Math.PI * radius * radius
    override fun perimeter() = 2 * Math.PI * radius
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area() = width * height
    override fun perimeter() = 2 * (width + height)
}

fun main() {
    val t = Temperature()
    t.celsius = 100.0
    println("Celsius: ${t.celsius}, Fahrenheit: ${t.fahrenheit}")

    val item1 = Item(1, "Sword", 1)
    val item2 = item1.copy(name = "Shield")
    println(item1)
    println(item2)

    val (id, name, qty) = item1
    println("id=$id, name=$name, qty=$qty")

    // val h = Human() // error - cannot instantiate abstract class
    val person = Person(25)
    val student = Student(20)
    person.hello()
    student.hello()

    val circle = Circle(5.0)
    val rect = Rectangle(4.0, 6.0)
    println("Circle area: ${circle.area()}")
    println("Rectangle perimeter: ${rect.perimeter()}")
}
