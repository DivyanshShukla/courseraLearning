package functionalProg

object sqrtNewton {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
                                                  
  def absolute(a:Double) = if(a>0) a else -a      //> absolute: (a: Double)Double
  
  def Newton( estimate: Double, number: Double): Double =
  	if(absolute(estimate*estimate - number) < 0.000000001) estimate
  	else (Newton((estimate + number/estimate)/2, number))
                                                  //> Newton: (estimate: Double, number: Double)Double
  	
  def square(x: Double) = Newton(1.0, x)          //> square: (x: Double)Double
  
  square(4)                                       //> res0: Double = 2.000000000000002
  square(3)                                       //> res1: Double = 1.7320508075688772
  square(16)                                      //> res2: Double = 4.000000000000051
  square(1e-6)                                    //> res3: Double = 0.0010000001533016628
  square(1.0e30)                                  //> res4: Double = 1.0E15
                                               
}