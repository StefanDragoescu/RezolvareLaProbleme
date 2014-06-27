
public class problema2 {


	
	static void numere(int[] a)
	{
		int max1= a[0];
		int max2= -2147483648;
		int ver=0;
		for (int i=0;i<a.length ;i++){
			if(max1<=a[i])
				if(max1==a[i])
					max1=a[i];
				else 
				{
					max2=max1;
					max1=a[i];
					ver=ver+1;
				}
			else
			{
				if(max2<a[i]){
					ver=ver+1;
					max2=a[i];
				}
			}
		}
		if (ver != 0)
	System.out.println("primul numar este : "+ max1+ " iar al-II-lea numar este :" + max2);
		else
			if (ver==0)
			{
				
				System.out.print("Primul numar este : "+ max1);
				System.out.println ("  Vercorul nu are un al-II-lea maxim acestea avand toate numerele egale");
			}
		
	}
}
