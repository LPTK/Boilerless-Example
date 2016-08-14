import boilerless._

object Main extends App {
  
  @enum class MyEnum(val name: String) {
    val toplevel = true
    
    object Sub0 {"Sub0"}
    
    @enum class SubEnum(n: String) { _(n)
      toplevel = false
      
      object Sub1 {"SubEnum.Sub1"}
      class Sub2(n0: String) {n0}
    }
  }
  
  import MyEnum._
  
  assert(Sub0.name == "Sub0")
  assert(SubEnum.Sub2("Bobby").name == "Bobby")
  
  println("Done.")
}

