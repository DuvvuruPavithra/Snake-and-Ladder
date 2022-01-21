package Com.BridgeLabz;

public class DiceUc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0;
		int counter=0;
		
		while(position<100)
		{
			double a=Math.floor( ((Math.random()*10) % 6)+1 );
			double b=Math.floor((Math.random()*10) % 2);
			int dice=(int)a;
			int check=(int)b;
			counter++;
			
			switch (check) 
			{
			
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
			System.out.println("Dice number= "+dice);
			System.out.println("My position: "+position);
			//System.out.println();
		}	
       System.out.println("Total number of times the dice was played= "+counter);

	}

}
