

public class SnakeandLadders {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int position1=0;
	     System.out.println("Player1 is initially at " + position1);
	     double dice;
	     int value;
	   while(true)
	   {
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice 1 rolled at "+ value);
	     position1=position1+value;
	     }
	     else
	    	 break;
	   }

	}
}

/*Output:
 Player1 is initially at 0
Dice 1 rolled at 2
Dice 1 rolled at 1
Dice 1 rolled at 4
Dice 1 rolled at 5
Dice 1 rolled at 1
Dice 1 rolled at 1
Dice 1 rolled at 1
Dice 1 rolled at 4
*/
