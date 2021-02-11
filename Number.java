//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Merioles


//write the Number class; use the handout and sample runner code to guide you

//header for Number class
public class Number {
  //private instance variable (must be an Integer)
  private Integer x;
  //constructor
  public Number(){
    x = 0;
  }
  public Number(int num) {
    x = num;
  }

  //getter method
  public Integer getNumber(){
    return x;
  }

  //setter method
  public void setNumber(int y){
    x = y;
  }
  //isOdd method
  public boolean isOdd(){
    return (x % 2 != 0);
  }
  //isPerfect method
  public boolean isPerfect(){
    int sum = 0;
    for (int i = 1; i < x; i++){
      if (x % i == 0)
        sum += i;
    }
    return (sum == x);
  }

  //toString
  public String toString(){
    return "" + x;
  }

} 