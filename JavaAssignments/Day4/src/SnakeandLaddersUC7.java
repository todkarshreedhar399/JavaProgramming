
public class SnakeandLaddersUC7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int p1position1=0;
		 int p2position1=0;
	     System.out.println("Player1 is initially at " + p1position1);
	     System.out.println("Player1 is initially at " + p2position1);
	     double dice;
	     int dice_countp1=0;
	     int dice_countp2=0;
	     int value;
	     while(p1position1<=100 || p2position1<=100)
	     {
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice for Player 1 rolled at "+ value);
	     p1position1=p1position1+value;
	     dice_countp1++;
	     }
	     else
	    	 continue;
	     dice=Math.floor(Math.random()*10)%7;
	     if(dice>0)
	     {
	     value=(int)dice;
	     System.out.println("Dice for Player 2 rolled at "+ value);
	     p2position1=p2position1+value;
	     dice_countp2++;
	     }
	    
	     if(p1position1==2)
	     {
	    	 System.out.println("Player1 Ladder to 23");
	    	 p1position1=23;
	     }
	     else if(p1position1==7)
	     {
	    	 System.out.println("Player1 Ladder to 29");
	    	 p1position1=29;
	     }
	     else if(p1position1==22)
	     {
	    	 System.out.println("Player1 Ladder to 41");
	    	 p1position1=41;
	     }
	     else if(p1position1==28)
	     {
	    	 System.out.println("Player1 Ladder to 77");
	    	 p1position1=77;
	     }
	     else if(p1position1==30)
	     {
	    	 System.out.println("Player1 Ladder to 32");
	    	 p1position1=32;
	     }
	     else if(p1position1==54)
	     {
	    	 System.out.println("Player1 Ladder to 69");
	    	 p1position1=77;
	     }
	     else if(p1position1==70)
	     {
	    	 System.out.println("Player1 Ladder to 90");
	    	 p1position1=90;
	     }
	     else if(p1position1==80)
	     {
	    	 System.out.println("Player1 Ladder to 98");
	    	 p1position1=98;
	     }
	     else if(p1position1==27)
	     {
	    	 System.out.println("Player1 Snaked to 6");
	    	 p1position1=6;
	     }
	     else if(p1position1==35)
	     {
	    	 System.out.println("Player1 Snaked to 5");
	    	 p1position1=5;
	     }
	     else if(p1position1==39)
	     {
	    	 System.out.println("Player1 Snaked to 3");
	    	 p1position1=3;
	     }
	     else if(p1position1==50)
	     {
	    	 System.out.println("Player1 Snaked to 34");
	    	 p1position1=34;
	     }
	     else if(p1position1==59)
	     {
	    	 System.out.println("Player1 Snaked to 46");
	    	 p1position1=46;
	     }
	     else if(p1position1==66)
	     {
	    	 System.out.println("Player1 Snaked to 24");
	    	 p1position1=24;
	     }
	     else if(p1position1==73)
	     {
	    	 System.out.println("Player1 Snaked to 12");
	    	 p1position1=12;
	     }
	     else if(p1position1==76)
	     {
	    	 System.out.println("Player1 Snaked to 63");
	    	 p1position1=63;
	     }
	     else if(p1position1==89)
	     {
	    	 System.out.println("Player1 Snaked to 67");
	    	 p1position1=67;
	     }
	     else if(p1position1==97)
	     {
	    	 System.out.println("Player1 Snaked to 75");
	    	 p1position1=75;
	     }
	     else if(p1position1==99)
	     {
	    	 System.out.println("Player1 Snaked to 26");
	    	 p1position1=26;
	     }
	     
	     if(p2position1==2)
	     {
	    	 System.out.println("Player2 Ladder to 23");
	    	 p2position1=23;
	     }
	     else if(p2position1==7)
	     {
	    	 System.out.println("Player2 Ladder to 29");
	    	 p2position1=29;
	     }
	     else if(p2position1==22)
	     {
	    	 System.out.println("Player2 Ladder to 41");
	    	 p2position1=41;
	     }
	     else if(p2position1==28)
	     {
	    	 System.out.println("Player2 Ladder to 77");
	    	 p2position1=77;
	     }
	     else if(p2position1==30)
	     {
	    	 System.out.println("Player2 Ladder to 32");
	    	 p2position1=32;
	     }
	     else if(p2position1==54)
	     {
	    	 System.out.println("Player2 Ladder to 69");
	    	 p2position1=77;
	     }
	     else if(p2position1==70)
	     {
	    	 System.out.println("Player2 Ladder to 90");
	    	 p2position1=90;
	     }
	     else if(p2position1==80)
	     {
	    	 System.out.println("Player2 Ladder to 98");
	    	 p2position1=98;
	     }
	     else if(p2position1==27)
	     {
	    	 System.out.println("Player2 Snaked to 6");
	    	 p2position1=6;
	     }
	     else if(p2position1==35)
	     {
	    	 System.out.println("Player2 Snaked to 5");
	    	 p2position1=5;
	     }
	     else if(p2position1==39)
	     {
	    	 System.out.println("Player2 Snaked to 3");
	    	 p2position1=3;
	     }
	     else if(p2position1==50)
	     {
	    	 System.out.println("Player2 Snaked to 34");
	    	 p2position1=34;
	     }
	     else if(p2position1==59)
	     {
	    	 System.out.println("Player2 Snaked to 46");
	    	 p2position1=46;
	     }
	     else if(p2position1==66)
	     {
	    	 System.out.println("Player2 Snaked to 24");
	    	 p2position1=24;
	     }
	     else if(p2position1==73)
	     {
	    	 System.out.println("Player2 Snaked to 12");
	    	 p2position1=12;
	     }
	     else if(p2position1==76)
	     {
	    	 System.out.println("Player2 Snaked to 63");
	    	 p2position1=63;
	     }
	     else if(p2position1==89)
	     {
	    	 System.out.println("Player2 Snaked to 67");
	    	 p2position1=67;
	     }
	     else if(p2position1==97)
	     {
	    	 System.out.println("Player2 Snaked to 75");
	    	 p2position1=75;
	     }
	     else if(p2position1==99)
	     {
	    	 System.out.println("Player2 Snaked to 26");
	    	 p2position1=26;
	     }
	     
	     
	     
	     
	     if (p1position1>100 || p2position1>100)
	     {
	    	 if(p1position1>100)
	    	 {
	    	 p1position1=p1position1-value;
	    	 continue;
	    	 }
	    	 else
	    	 {
	    		 p2position1=p2position1-value;
		    	 continue;
	    	 }
	     }else if(p1position1==100 || p2position1==100)
	     {
	    	 if(p1position1==100)
	    	 {
	    		 System.out.println();
	    	 System.out.println("Player1 reached 100");
	    	 System.out.println("Player 1 Wins");
	    	 System.out.println();
	    	 break;
	    	 }
	    	 else
	    	 {   System.out.println();
	    		 System.out.println("Player2 reached 100");
	    		 System.out.println("Player 2 Wins");
	    		 System.out.println();
		    	 break; 
	    	 }
	     }
	     System.out.println("Player1 is at "+ p1position1);
	     System.out.println("Player2 is at "+ p2position1);
	     System.out.println();
	     }
	     System.out.println("Player1 is now at "+ p1position1); 
	     System.out.println("Player2 is now at "+ p2position1); 
	     System.out.println();
	  
	} 
}
/*Output:
Player1 is initially at 0
Player1 is initially at 0
Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 2
Player2 Ladder to 23
Player1 is at 3
Player2 is at 23

Dice for Player 1 rolled at 6
Player1 is at 9
Player2 is at 23

Dice for Player 1 rolled at 1
Player1 is at 10
Player2 is at 23

Dice for Player 1 rolled at 1
Player1 is at 11
Player2 is at 23

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 4
Player2 Snaked to 6
Player1 is at 16
Player2 is at 6

Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 6
Player1 is at 19
Player2 is at 12

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 3
Player1 is at 20
Player2 is at 15

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 1
Player1 Ladder to 41
Player1 is at 41
Player2 is at 16

Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 1
Player1 is at 44
Player2 is at 17

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 1
Player1 Snaked to 34
Player1 is at 34
Player2 is at 18

Dice for Player 1 rolled at 1
Player1 Snaked to 5
Player1 is at 5
Player2 is at 18

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 5
Player1 Ladder to 29
Player1 is at 29
Player2 is at 23

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 3
Player1 Ladder to 32
Player1 is at 32
Player2 is at 26

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 6
Player1 is at 37
Player2 is at 32

Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 2
Player1 is at 41
Player2 is at 34

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 2
Player1 is at 47
Player2 is at 36

Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 1
Player1 Snaked to 34
Player1 is at 34
Player2 is at 37

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 3
Player1 Snaked to 5
Player1 is at 5
Player2 is at 40

Dice for Player 1 rolled at 3
Player1 is at 8
Player2 is at 40

Dice for Player 1 rolled at 2
Player1 is at 10
Player2 is at 40

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 1
Player1 is at 12
Player2 is at 41

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 4
Player1 is at 14
Player2 is at 45

Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 2
Player1 is at 18
Player2 is at 47

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 2
Player1 is at 20
Player2 is at 49

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 4
Player1 is at 26
Player2 is at 53

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 2
Player1 is at 32
Player2 is at 55

Dice for Player 1 rolled at 2
Player1 is at 34
Player2 is at 55

Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 6
Player1 is at 38
Player2 is at 61

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 1
Player1 is at 44
Player2 is at 62

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 2
Player1 is at 46
Player2 is at 64

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 2
Player2 Snaked to 24
Player1 is at 51
Player2 is at 24

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 2
Player1 is at 52
Player2 is at 26

Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 5
Player1 is at 55
Player2 is at 31

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 6
Player1 is at 60
Player2 is at 37

Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 3
Player1 is at 64
Player2 is at 40

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 2
Player1 is at 65
Player2 is at 42

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 1
Player1 Snaked to 24
Player1 is at 24
Player2 is at 43

Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 2
Player1 Ladder to 77
Player1 is at 77
Player2 is at 45

Dice for Player 1 rolled at 6
Dice for Player 2 rolled at 4
Player1 is at 83
Player2 is at 49

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 1
Player2 Snaked to 34
Player1 is at 85
Player2 is at 34

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 4
Player1 is at 87
Player2 is at 38

Dice for Player 1 rolled at 3
Dice for Player 2 rolled at 2
Player1 is at 90
Player2 is at 40

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 5
Player1 is at 95
Player2 is at 45

Dice for Player 1 rolled at 1
Dice for Player 2 rolled at 5
Player2 Snaked to 34
Player1 is at 96
Player2 is at 34

Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 6
Player1 is at 98
Player2 is at 40

Dice for Player 1 rolled at 5
Dice for Player 2 rolled at 3
Dice for Player 1 rolled at 4
Dice for Player 2 rolled at 5
Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 3
Dice for Player 1 rolled at 2
Dice for Player 2 rolled at 6

Player1 reached 100
Player 1 Wins

Player1 is now at 100
Player2 is now at 57


*/