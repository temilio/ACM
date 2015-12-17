import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class MeteorFlow {
	
	public static void main(String[] args) {
		//PriorityQueue<Integer> dano = new PriorityQueue<Integer>();
		int m = 10010;
    	
	    Scanner in = new Scanner(System.in);
	    m = in.nextInt();
	    int maxDano = 0;
	    int tiempo;
	    int laser = 0;
	    int escudo = 0, danoAc = 0;
	    TreeMap<Integer,Integer> obj = new TreeMap<Integer,Integer>();
	    int dano = 0;
	    
	    
	    for(int i = 0; i < m; i++)
	    {
	    	tiempo=in.nextInt();
	    	dano=in.nextInt();
	    	
	    	// HISTORIO DE DAÑOS Y FRECUENCIA
	    	Integer value = obj.get(dano);
            if(value==null){
            	obj.put(dano, 1);
            }
            else{
            	value = value +1;
            	obj.put(dano,value);
            }
	    	
            
            
	        danoAc += dano;
	        escudo = tiempo - danoAc;
	        if(escudo < 0)
	        {
	        	//LE QUITA EL DAÑO MAXIMO
	            Integer danoMaximo = obj.lastKey();
	            
	        	danoAc -= danoMaximo;
	            
	        	
	            // LE RESTA 1 VALOR AL DAÑO MAXIMO O LO DEJA EN NULL
	        	Integer frec = obj.get(danoMaximo);
	            if(frec==1){
	            	obj.remove(danoMaximo);
	            }
	            else{
	            	frec--;
	            	obj.put(danoMaximo,frec);
	            }
	            
	            
	            laser += 1;
	        }   
	    }
	    System.out.println(laser);
	    
	}
		
}

