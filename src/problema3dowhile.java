
public class problema3dowhile {
	static boolean  verificare(int[] a){
		boolean b=false;
		int i=0;
		
				while ((i<=a.length) & (b=false)){
					
					 if (a[Math.abs(a[i])] > 0){
						 a[Math.abs(a[i])]= -a[Math.abs(a[i])];
						 i=i+1;
					 }
					 	else
							b=true;
				 }

				return b;
				
			}

}
