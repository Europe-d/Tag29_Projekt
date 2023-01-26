import kotlin.contracts.contract

fun main() {

    var hund1 : Hunden = Hunden ("Bello","Golden-Retriever")
    var hund2 : Hunden = Hunden ("tzak","Akita.")
    var hund3 : Hunden = Hunden ("sisi","Anatolischer Hirtenhund")
    var katze :  HundOderKatze= HundOderKatze ("josi","Maine Coon",false)
    var hund5 : HundOderKatze= HundOderKatze ("Luna","akita",true)

    hund1.bellen()
    katze.bellen()
    hund5.bellen()
}



