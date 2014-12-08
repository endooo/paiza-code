package sample;
import java.util.Scanner;

public class PaizaC10 {

	public static void main (String[] args) {

	    try(Scanner scanner = new Scanner(System.in)){
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int r = scanner.nextInt();
	        
	        Work work = new Work(a, b, r);
	        int count = scanner.nextInt();
	        
	        for(int i=0;i<count;i++){
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	            System.out.println(work.check(x, y));
	        }
            
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	
	static class Work {
	    int a;
	    int b;
	    double size;
	    
	    public Work(int a, int b, int size) {
	        this.a = a;
	        this.b = b;
	        this.size = Math.pow(size,2);
        }
	    
	    public String check(int x, int y){
	        double r = Math.pow(a-x,2) + Math.pow(b-y,2);
	        
	        if(size>r)
	            return "noisy";
	        else
	            return "silent";
	    }
	}
	
}
