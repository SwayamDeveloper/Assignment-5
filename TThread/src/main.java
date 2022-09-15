class Test extends Thread{
	public void run(){
		int sum = 0;
		for(int i=0; i<=50; i++) {
			sum=sum+i;
		}
		double avg = sum/50;
		System.out.println("Average of first 50 numbers are"+avg);
	}
}

class Test1 extends Thread{
	public void run() {
		int arr[]= {5,10,12,14,11};
		int result[] = new int[arr.length];
		System.out.println("Square of arrays numbers are:");
		for(int i=0; i<arr.length; i++) {
			result[i] = arr[i]*arr[i];
			System.out.println(result[i]+" ");
	}
}
}
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test t = new Test();
         t.start();
		
		Test1 t1= new Test1();
           t1.start();
	
	}
          
}

	

