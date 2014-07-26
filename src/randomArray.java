import java.util.Random;
import java.util.Random;
@SuppressWarnings("unused")
public class randomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index, index1, index2;
		Random ran = new Random();
		 int[] array = new int[50];
		 for (index = 0; index< array.length; index ++)
		 {
			 //array[index] = (int)(Math.random()*501) ;
			 array[index] = ran.nextInt(500)+1;

		 }
		 for(index1 = 0; index1< array.length; index1++)
		 {
			// array[index1] = (int)(Math.random()*501) ;
			 System.out.print(array[index1] + " ");

		 } 
		 System.out.println();
		 System.out.println(" ");
		 
		 	for (index2 = 0; index2< array.length; index2++)
		 		
		 		
		 	{
				 //array[index2] = (int)(Math.random()*501) ;
	
			 if(array[index2]% 2 == 0)
			 
				 
			 
				System.out.print(array[index2] + " ");
		 	}
			 
		 }
	}


