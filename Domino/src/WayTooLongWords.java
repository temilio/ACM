
import java.util.Scanner;
public class WayTooLongWords {

    public static void main(String[] args) {
      String palabra,relleno,inter; String inicio,ultimo;int largo;
        Scanner entrada = new Scanner(System.in);
        int veces=entrada.nextInt();
        String palabras[] = new String[veces];
        for(int i=0;i<veces;i++){
            palabra=entrada.next();
            	
            if(palabra.length()<11){
                palabras[i]=""+palabra+"";
            }else{
                largo=palabra.length()-2;
                inicio=""+palabra.charAt(0);
                ultimo=""+palabra.charAt(largo+1);
                relleno=palabra.substring(0, palabra.length());
                palabras[i]= ""+inicio+""+largo+""+ultimo+"";
            }
        }
                        for(int j=0;j<veces;j++){
                            System.out.println(palabras[j]);
                        }
    }

}