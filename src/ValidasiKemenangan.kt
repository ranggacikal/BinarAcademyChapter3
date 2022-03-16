class ValidasiKemenangan(private var pemain1: String?, private var pemain2: String?) : Suit() {

    override fun hasil(): String {
        var hasilKemenengan: String? = null

        if (pemain1?.lowercase() == "gunting" && pemain2?.lowercase() == "batu"){
            hasilKemenengan = "Pemain 2 MENANG!"
        }else if (pemain1?.lowercase() == "batu" && pemain2?.lowercase() == "gunting"){
            hasilKemenengan = "Pemain 1 MENANG"
        }else if (pemain1?.lowercase() == pemain2?.lowercase()){
            hasilKemenengan = "DRAW!"
        }
        return hasilKemenengan.toString()
    }

}