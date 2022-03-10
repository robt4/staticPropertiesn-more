
public class Hha {                              //class
	int t=54; 
	
 public Hha () {                               //1st constructor same name as class
	 int jam=7;
	 
 }public Hha(String k){
	 
	 System.out.println("check the jam: "+k);        //2nd constructor
 }public int run() {
	 int x=9;
	 
	 return 0;
 }public int d() {
	 int x=90;
	 this.t=x;                                        //using this to change value of t/assign
	 System.out.println("still checking: "+ t);  
	 return 0;
 }
}
