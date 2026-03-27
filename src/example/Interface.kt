package example

interface Movable {
    val speed: Int
    val model: String
    val number: String

    fun move()

    fun stop() {
        println("Stopping...")
    }
}

class Car(override val speed: Int, override val model: String, override val number: String) : Movable {
    override fun move() {
        println("Car $model ($number) is moving at $speed km/h")
    }
}

class Aircraft(override val speed: Int, override val model: String, override val number: String) : Movable {
    override fun move() {
        println("Aircraft $model ($number) is flying at $speed km/h")
    }

    override fun stop() {
        println("Aircraft $model is landing...")
    }
}

interface Worker {
    fun work()
}

interface StudentRole {
    fun study()
}

class WorkingStudent : Worker, StudentRole {
    override fun work() {
        println("Working...")
    }

    override fun study() {
        println("Studying...")
    }
}

interface VideoPlayable {
    fun play() {
        println("Playing video...")
    }
}

interface AudioPlayable {
    fun play() {
        println("Playing audio...")
    }
}

class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}

fun travel(vehicle: Movable) {
    vehicle.move()
}

fun main() {
    val car = Car(120, "Toyota", "A123BC")
    val aircraft = Aircraft(900, "Boeing 737", "SU-001")

    car.move()
    aircraft.move()
    aircraft.stop()

    travel(car)
    travel(aircraft)

    val vehicles: List<Movable> = listOf(car, aircraft)
    vehicles.forEach { it.move() }

    val workingStudent = WorkingStudent()
    workingStudent.work()
    workingStudent.study()

    val player = MediaPlayer()
    player.play()
}
