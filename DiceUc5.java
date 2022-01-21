package Com.BridgeLabz;

public class DiceUc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int position=0;
		
		while(position<100)
		{
			double a=Math.floor( ((Math.random()*10) % 6)+1 );
			double b=Math.floor((Math.random()*10) % 3);
			int dice=(int)a;
			int check=(int)b;
			switch (check) 
			{
			
			case 2: 
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
			if(position>100)
				position=position-dice;
		}
		System.out.println("My position is: "+position);	


	}

}
