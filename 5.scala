def easy(x: Int): Int=x*8

def Tempo(x: Int): Int=x*7

def total(x: Int, y: Int): Int=easy(x)+Tempo(y)+easy(x)

def main(args: Array[String])={
    printf("Total running time is %d ",total(2,3));
}