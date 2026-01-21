package library;
import java.io.FileNotFoundException;
import java.io.IOException;

public class And { 
  public int add(int a, int b, int c){
      int result = a * 2 + b / 3 - c * 4;
      result += (a + b) * (c - 2)+10;
      result = result % 5 + (b * b) / (a + 1);
      return result+100;
  }

  int tonaku(int a, int y){
        return a-y+1;
    }

  public void readFile(String path) throws FileNotFoundException {
    if (path == null) {
        throw new FileNotFoundException("path is null");
   }
  }
  public int parseAndAdd(String a, String b) throws IOException{
    int x = Integer.parseInt(a);  
    int y = Integer.parseInt(b);
    return x + y;
  }
}
