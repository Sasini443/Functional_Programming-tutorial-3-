def bookPrice(x:Int):Double=x*24.95

def discount(amount: Double): Double= amount*.4

def shippingCost(x: Int): Double={if(x<=50) x*3 else x*3+(x-50)*.75}

def totalCost(x: Int): Double=bookPrice(x)-discount(bookPrice(x))+shippingCost(x)

def main(args: Array[String]) ={
    printf("The total wholesale cost is %.2f ",totalCost(60));
}