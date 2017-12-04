/**
*This class convert a file to a String
* @author: Zhaonan Li
*/
import java.io.File;
import java.util.Scanner;

public class ReadFile{

  public static void main(String[] args){
    String html = read("Team.html");
    System.out.println(html);
    System.out.println(html.length());
  }

  public static String read(String address) {
    String result = new String();
    File file = new File(address);
    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()){
        result += sc.nextLine();
        result += "\n";
      }
      sc.close();
    }
    catch (Exception e){
      System.out.println(e);
    }
    return result;
  }
}
