
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int i=1;
		int sum=0;
		while(n<8){
			System.out.println(sum);
			sum=n+i;
			n=i;
			i=sum;
			
		}
	}

}
