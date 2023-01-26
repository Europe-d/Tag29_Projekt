class Katzen{

    var name = ""
    var fellfarbe = ""


    constructor(name: String, fellfarbe: String) {
        this.name = name
        this.fellfarbe = fellfarbe

    }

    fun bellen() {

        println("miauen")


    }
}

fun main(){


    var katzen1: Katzen = Katzen("Mautzi","Schwarz")
    katzen1.bellen()
}