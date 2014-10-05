package functionalProg

class Trial(var first:String, var last:String) {
	def getName():String = first+last
}

object Main {
	def main(args:Array[String]) = {
	println((new Trial("Saumya" , " Agrawal").getName()))
	}
}

