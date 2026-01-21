package library;

public class And { 
  public int add(int a, int b, int c){
      int result = a * 2 + b / 3 - c * 4;
      result += (a + b) * (c - 2)+10;
      result = result % 5 + (b * b) / (a + 1);
      return result+100;
  }

  public int nantonaku(int a, int y){
        return a-y+1;
    }

  public void readFile(String path) throws IOException {
    if (path == null) {
        throw new IOException("path is null");
　  }
  }
}
