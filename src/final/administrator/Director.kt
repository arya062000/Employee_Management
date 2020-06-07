package final.administrator

interface Display {
    fun print()
}


interface Directors{
    val name: String
}
class Product: Display,Directors {
    override val name= "ABC"
    override fun print() {
        println("Product: ABC")
        println("Contact: 900000000")
    }
}
class Technical: Display,Directors {
    override val name= "DEF"
    override fun print() {
        println("Product: DEF")
        println("Contact: 800000000")
    }
}

