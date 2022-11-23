//Write a java program to compare two strings
public class ComparisionOfStrings {
	public static void main(String[] args) {
      String string1= "example";
      String string2= new String("example");
      if(string1=="example") {
    	  System.out.println("true");
    	        }
      else {
    	  System.out.println("false");
      }
      if(string2=="example") {
    	  System.out.println("true");
    	        }
      else {
    	  System.out.println("false");
      }
      if(string2.equals("example")) {
    	  System.out.println("true");
    	        }
      else {
    	  System.out.println("false");
      }
	}
}