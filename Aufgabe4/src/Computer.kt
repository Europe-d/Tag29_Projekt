class Computer {

    var on: Boolean


    constructor(on: Boolean) {
        this.on = on

    }


    fun pressOnButton() {
        on = true
    }

    fun sendEMail() {
        if (on)
            println("EMail sent!")
        else {
            println("fehler")
        }

    }

    fun pressOffButton() {
        on = false
    }


    fun meinePc() {
        if (on) {
            on = false
            println("computer wird gestoppt")
        } else {
        on = true
            println("computer wird gestartet")

        }


    }


}
