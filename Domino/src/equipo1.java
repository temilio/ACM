import java.util.Scanner;

public class equipo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int conta=0;
		int suma=0;
		int teclado=entrada.nextInt();
		int i=1;
		
		for(i=1;i<(teclado*3)+1;i++){
		suma+=entrada.nextInt();
		
		if(i%3==0){
			if(suma>1){
				conta++;
		        suma=0;
			}
		}
        
	}
		 System.out.println((conta));
	}
	 
}