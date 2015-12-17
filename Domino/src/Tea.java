import java.util.Scanner;

public class Tea {

	public static void main(String[] args) {
		int numte;
		int resp;
		int cont=0;
		int t=5;
		Scanner entrada=new Scanner(System.in);
		
		numte=entrada.nextInt();
        if(numte>=1&&numte<=4){
		for(int i=0;i<t;i++){
			
			resp=entrada.nextInt();
			
	
				if(resp==numte){
					cont++;
			}
		
		}	
		
		
		
		System.out.println(cont);

		
	}
	   
}

}