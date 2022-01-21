package Com.BridgeLabz;

public class DiceUc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int position=0;
		
		while(position<=100)
		{
			double a=Math.floor( ((Math.random()*10) % 6)+1 );
			double b=Math.floor((Math.random()*10) % 2);
			int dice=(int)a;
			int check=(int)b;
			switch (check) 
			{
			
			case 2: 
				position=0;
				System.out.println("No one play the game");
				break;
			case 1: 
				position=position+dice;
				System.out.println("Ladder");
				break;
			case 0: 
			{
				position=position-dice;
				System.out.println("Snake");
				if(position<0)
					position=0;
				break;
			}
			
			}
		}
		System.out.println("The position is: "+position);


	}

}
