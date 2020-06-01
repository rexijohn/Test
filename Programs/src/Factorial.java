
public class Factorial {
 static int n2=1;
	
	public static int recursion(int n1){	
		if(n1<=2){
			return n1;
			//changes
		    //changes are made as expected
		}
		
		n1=n1*recursion(n1-1);
		return n1;		
	}
	
		
	public static void main(String[] args) {
	   // TODO Auto-generated method stub		
	   int n=4;
	   if(n==0){
		   System.out.println(0);
	   }
	   if(n==1){
		   System.out.println(1);
	   }
		  n=recursion(n);
		   System.out.println(n);	   
	}

}
