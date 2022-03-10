
public class Statics {
  private String name;
  public static int fell;            //dont need an object in main to access it.
  public static String ki() {        //same as above but its amethod
	  return "";
  }
  public void setName(String i) {      //private name initialized
	  name=i;
  }public String getname() {           //returning private name
	  return name;
  }                                    //constructors can be private too
  
}
