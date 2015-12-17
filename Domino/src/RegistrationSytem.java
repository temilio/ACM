import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSytem {

	public static void main(String[] args) {

			Map<String, Integer> nombreMap = new HashMap<String, Integer>();

			Scanner entrada = new Scanner(System.in);
			int registro = entrada.nextInt();
			
			for(int i=0; i<registro; i++){
				String palabra = entrada.next();
				if(nombreMap.get(palabra) == null){
					nombreMap.put(palabra, 1);
					System.out.println("OK");
				}else{
					System.out.println(palabra+""+(nombreMap.get(palabra)));
					nombreMap.put(palabra, (nombreMap.get(palabra)+1));
				}
			}
		}
			
		
		}
		
	


