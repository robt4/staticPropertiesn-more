
public class Practize {
	public Practize() {
		int check;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x=0;
         Hha num=new Hha();                         //empty constructor accesing 
         Hha nm=new Hha("fear");                    //Accesing constructor and passing in a string;
         num.d();                                   //accesing the function in hha
         Statics.fell=34;                             //Accesing statics fell variable without an object
	     Statics.ki();                               //Accessing a static method no need to create an object
	     Statics jav=new Statics();
	     jav.getname();                              //to access the private
	}

}
