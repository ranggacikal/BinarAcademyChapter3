class GameSuit {

    var pemain1: String? = null
    var pemain2: String? = null

    fun validasiKemenangan(){
        if (pemain1?.lowercase() == "gunting" && pemain2?.lowercase() == "batu"){
            println("Pemain 2 MENANG!")
        }else if (pemain1?.lowercase() == "batu" && pemain2?.lowercase() == "gunting"){
            println("Pemain 1 MENANG")
        }else if (pemain1?.lowercase() == pemain2?.lowercase()){
            println("DRAW!")
        }
    }

}