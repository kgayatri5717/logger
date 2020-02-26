package houseconstruction;

public class Calculation {
	public double constructionCost(int housearea,int materialStandard,int automated)
	{
		double cost=0;
		if(automated==0)
		{
			switch(materialStandard)
			{
			case 0:cost=housearea*1200;
			       break;
			case 1:cost=housearea*1500;
		       break;
			case 2:cost=housearea*1800;
		       break;
		       
			}
		}
		else {
			if(materialStandard==2)
				cost=housearea*2500;
		}
		return cost;
	}

}
