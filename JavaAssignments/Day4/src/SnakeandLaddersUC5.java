
public class SnakeandLaddersUC5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int position1=0;
	     System.out.println("Player1 is initially at " + position1);
	     double dice;
	     int value;
	     while(position1<=100)
	     {
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice 1 rolled at "+ value);
	     position1=position1+value;
	     }
	     else
	    	 continue;
	     if(position1==2)
	     {
	    	 System.out.println("Ladder to 23");
	    	 position1=23;
	     }
	     else if(position1==7)
	     {
	    	 System.out.println("Ladder to 29");
	    	 position1=29;
	     }
	     else if(position1==22)
	     {
	    	 System.out.println("Ladder to 41");
	    	 position1=41;
	     }
	     else if(position1==28)
	     {
	    	 System.out.println("Ladder to 77");
	    	 position1=77;
	     }
	     else if(position1==30)
	     {
	    	 System.out.println("Ladder to 32");
	    	 position1=32;
	     }
	     else if(position1==54)
	     {
	    	 System.out.println("Ladder to 69");
	    	 position1=77;
	     }
	     else if(position1==70)
	     {
	    	 System.out.println("Ladder to 90");
	    	 position1=90;
	     }
	     else if(position1==80)
	     {
	    	 System.out.println("Ladder to 98");
	    	 position1=98;
	     }
	     else if(position1==27)
	     {
	    	 System.out.println("Snaked to 6");
	    	 position1=6;
	     }
	     else if(position1==35)
	     {
	    	 System.out.println("Snaked to 5");
	    	 position1=5;
	     }
	     else if(position1==39)
	     {
	    	 System.out.println("Snaked to 3");
	    	 position1=3;
	     }
	     else if(position1==50)
	     {
	    	 System.out.println("Snaked to 34");
	    	 position1=34;
	     }
	     else if(position1==59)
	     {
	    	 System.out.println("Snaked to 46");
	    	 position1=46;
	     }
	     else if(position1==66)
	     {
	    	 System.out.println("Snaked to 24");
	    	 position1=24;
	     }
	     else if(position1==73)
	     {
	    	 System.out.println("Snaked to 12");
	    	 position1=12;
	     }
	     else if(position1==76)
	     {
	    	 System.out.println("Snaked to 63");
	    	 position1=63;
	     }
	     else if(position1==89)
	     {
	    	 System.out.println("Snaked to 67");
	    	 position1=67;
	     }
	     else if(position1==97)
	     {
	    	 System.out.println("Snaked to 75");
	    	 position1=75;
	     }
	     else if(position1==99)
	     {
	    	 System.out.println("Snaked to 26");
	    	 position1=26;
	     }
	     if (position1>100)
	     {
	    	 position1=position1-value;
	    	 continue;
	     }else if(position1==100)
	     {
	    	 System.out.println("Player1 reached 100");
	    	 break;
	     }
	     System.out.println("Player1 is at "+ position1);
	     System.out.println();
	     }
	     System.out.println("Player1 is now at "+ position1);  
	} 

}
/*Output:
Player1 is initially at 0
Dice 1 rolled at 4
Player1 is at 4

Dice 1 rolled at 1
Player1 is at 5

Dice 1 rolled at 5
Player1 is at 10

Dice 1 rolled at 5
Player1 is at 15

Dice 1 rolled at 3
Player1 is at 18

Dice 1 rolled at 1
Player1 is at 19

Dice 1 rolled at 6
Player1 is at 25

Dice 1 rolled at 1
Player1 is at 26

Dice 1 rolled at 2
Ladder to 77
Player1 is at 77

Dice 1 rolled at 3
Ladder to 98
Player1 is at 98

Dice 1 rolled at 1
Snaked to 26
Player1 is at 26

Dice 1 rolled at 6
Player1 is at 32

Dice 1 rolled at 2
Player1 is at 34

Dice 1 rolled at 1
Snaked to 5
Player1 is at 5

Dice 1 rolled at 4
Player1 is at 9

Dice 1 rolled at 2
Player1 is at 11

Dice 1 rolled at 5
Player1 is at 16

Dice 1 rolled at 2
Player1 is at 18

Dice 1 rolled at 4
Ladder to 41
Player1 is at 41

Dice 1 rolled at 5
Player1 is at 46

Dice 1 rolled at 1
Player1 is at 47

Dice 1 rolled at 3
Snaked to 34
Player1 is at 34

Dice 1 rolled at 6
Player1 is at 40

Dice 1 rolled at 3
Player1 is at 43

Dice 1 rolled at 2
Player1 is at 45

Dice 1 rolled at 2
Player1 is at 47

Dice 1 rolled at 2
Player1 is at 49

Dice 1 rolled at 1
Snaked to 34
Player1 is at 34

Dice 1 rolled at 6
Player1 is at 40

Dice 1 rolled at 2
Player1 is at 42

Dice 1 rolled at 1
Player1 is at 43

Dice 1 rolled at 5
Player1 is at 48

Dice 1 rolled at 2
Snaked to 34
Player1 is at 34

Dice 1 rolled at 1
Snaked to 5
Player1 is at 5

Dice 1 rolled at 5
Player1 is at 10

Dice 1 rolled at 1
Player1 is at 11

Dice 1 rolled at 2
Player1 is at 13

Dice 1 rolled at 3
Player1 is at 16

Dice 1 rolled at 2
Player1 is at 18

Dice 1 rolled at 3
Player1 is at 21

Dice 1 rolled at 5
Player1 is at 26

Dice 1 rolled at 6
Player1 is at 32

Dice 1 rolled at 3
Snaked to 5
Player1 is at 5

Dice 1 rolled at 2
Ladder to 29
Player1 is at 29

Dice 1 rolled at 3
Player1 is at 32

Dice 1 rolled at 6
Player1 is at 38

Dice 1 rolled at 1
Snaked to 3
Player1 is at 3

Dice 1 rolled at 2
Player1 is at 5

Dice 1 rolled at 1
Player1 is at 6

Dice 1 rolled at 5
Player1 is at 11

Dice 1 rolled at 1
Player1 is at 12

Dice 1 rolled at 2
Player1 is at 14

Dice 1 rolled at 2
Player1 is at 16

Dice 1 rolled at 2
Player1 is at 18

Dice 1 rolled at 6
Player1 is at 24

Dice 1 rolled at 4
Ladder to 77
Player1 is at 77

Dice 1 rolled at 1
Player1 is at 78

Dice 1 rolled at 2
Ladder to 98
Player1 is at 98

Dice 1 rolled at 2
Player1 reached 100
Player1 is now at 100

*/