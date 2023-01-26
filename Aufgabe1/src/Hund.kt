class Hunden {

    var name = ""
    var rasse = ""


    constructor(name: String, rasse: String) {
        this.name = name
        this.rasse = rasse

    }

    fun bellen() {

        println("woof woof")


    }
}

class HundOderKatze {

    var name = ""
    var rasse = ""
    var istHund: Boolean

    constructor(name: String, rasse: String, istHund: Boolean) {
        this.name = name
        this.rasse = rasse
        this.istHund = istHund
    }

    fun bellen() {
        if (istHund) {
            println("woof woof")
        } else {
            println("miauen,miauen")
        }

    }
}

