fun main() {

    println("=============================")
    println("GAME SUIT TERMINAL VERSION")
    println("===========================")
//    val gameSuit = GameSuit()
//
//
//    print("Masukan pemain 1 : ")
//    val pemain1 = readLine()
//    gameSuit.pemain1 = pemain1
//
//    print("Masukan pemain 2 : ")
//    val pemain2 = readLine()
//    gameSuit.pemain2 = pemain2
//
//    gameSuit.validasiKemenangan()

    val suit = Suit()

    var pemain1Choose: String? = null
    var pemanin2Choose: String? = null

    print("Masukan pemain 1 : ")
    pemain1Choose = readLine()

    print("Masukan pemain 2 : ")
    pemanin2Choose = readLine()

    val validasiKemenangan = ValidasiKemenangan(pemain1Choose, pemanin2Choose)

    suit.hasil()

    println("")
    println("Hasil : ")
    println(validasiKemenangan.hasil())

}
