package final.administrator


open class Admin (var emp_id: Int=0,  var basic_pay:Int , var da: Int, var hra: Int){

    var salary: Int
    get() = basic_pay+((hra*basic_pay)/100)+((da*basic_pay)/100)
    set(value) {
        salary = value
    }

    init {
        println("Administrator initializing")
    }




}
 fun Admin.print() {
    println("Employee Id: $emp_id  " +
            "Salary: $salary  ")
}
