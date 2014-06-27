/*
 *Am folosit un for (la prblema3) si un while(problema3dowhile) pentru rezolvarea problemei.
 */
public class prblema3 {

	static boolean  verificare(int[] a){
boolean b=false;

		for (int i=0;i<a.length;i++){
			
			 if (a[Math.abs(a[i])] > 0)
				 
				 a[Math.abs(a[i])]= -a[Math.abs(a[i])];
				 
			 	else
					b=true;
		 }
	
		return b;
		
	}
}
