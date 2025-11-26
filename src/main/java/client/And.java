package client;

public class And { 

  
  public int newadd(int a, int b, int c){
      int result = a * 2 + b / 3 - c * 4;
      result += (a + b) * (c - 2)+10;
      result = result % 5 + (b * b) / (a + 1);
      return result+100;
  }
}

