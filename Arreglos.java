import java.io.*;
import static java.lang.Math. *;
public class Main
{
	public static void main(String[] args) {
	    //Generar variables para la operacion
	    double x=0, h=0.1, exponente=2;
	    //Generar arreglo V1
	    double V1[];
	    V1=new double [20];
	    //Comprobamos que se han creado
		System.out.println ("El arreglo V1 se ha creado con " + V1.length +" elementos");
		double []V2=new double[30];
	    System.out.println ("El arreglo V2 se ha creado con " + V2.length +" elementos");
	    //Llenamos V1
		for (int i=0; i>=0 && i<20 ;i++){
		    V1[i]= Math.log(Math.pow (x,exponente)+2);
		    x= x + h;
		}
		//Imprimimos V1
		System.out.println("-----Arreglo V1-----");
	    for(int i=0;i<V1.length;i++){
	        int el= i+ 1;
            System.out.println("V1["+ el + "]= " + V1[i]);
	    }
	    //Llenamos V2
	    for (int i=0; i>=0 && i<30 ;i++){
	        int num=i + 1;
		    V2[i]= num;
		}
	   //Imprimimos V2 (forma 1)
		/*System.out.println("-----Arreglo V2-----");
		for(int i=0;i<V2.length;i++){
	      	 int el= i+ 1;
            System.out.println("V2["+ el + "]= " + (int) V2[i]);
	    }
	    */
	    //Imprimimos V2 (forma 2)
		System.out.println("-----Arreglo V2-----");
		System.out.print("V2= [");
		for(int i=0;i<V2.length;i++){
            System.out.print((int) V2[i]+", ");
	    }
	    System.out.println("] ");
	    
	    /*
	    Copia de V1 a V2.
	    -12 Elementos
	    -Empezando en V1[7] y V2[10]
	    */
	    
	     System.arraycopy(V1,6,V2,9,12);
		
		//Imprimimos el arreglo resultante
		System.out.println("-----Arreglo V2 resultante-----");
		for(int i=0;i<V2.length;i++){
	        int el= i+ 1;
            System.out.println("V2["+ el + "]= " + V2[i]);
	    }

    }
}
