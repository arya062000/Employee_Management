package final.administrator

fun newEmployee() {
    print("Enter Employee ID: ")
    val id = Integer.valueOf(readLine())

    print("Enter Basic Pay: ")
    val pay= Integer.valueOf(readLine())
    print("Enter DA(in %): ")
    val da = Integer.valueOf(readLine())
    print("Enter HRA(in %): ")
    val hra = Integer.valueOf(readLine())
    val e = Admin(id,pay,da,hra)
    e.print()
}

fun printDirectors()
{
    val p=Product()
    p.print();
    val t=Technical()
    t.print()
}

fun main(args: Array<String>) {
    println("Choose one.")
    println("1. Get Salary Of An Employee")
    println("2. Show the list of Directors")
    var choice=Integer.valueOf(readLine())
    when (choice) {
        1 -> newEmployee()
        2 -> printDirectors()
        else -> { // Note the block
            print("Invalid Command")
        }
    }


}