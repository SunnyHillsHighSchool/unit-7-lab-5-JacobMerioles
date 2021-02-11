//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Merioles

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int []x){
    list = new ArrayList<Number>();
    for (int j: x)
      list.add(new Number(j));
  }
	//write count odds
  public int countOdds(){
    int odd = 0;
    for (Number i: list)
      if (i.isOdd() == true)
        odd++;
    return odd;
  }
	//write count evens
  public int countEvens(){
    int even = 0;
    for (Number i: list)
      if (i.isOdd() == false)
        even++;
    return even;
  }

	//write count perfects
  public int countPerfects(){
    int perfect = 0;
    for (Number i: list)
      if (i.isPerfect() == true)
        perfect++;
    return perfect;
  }
	//write a toString
  public String toString(){
    return "" + list;
  }
}