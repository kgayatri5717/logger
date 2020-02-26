package houseconstruction;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maain {
	private static final Logger LOGGER=LogManager.getLogger(Maain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		Scanner s=new Scanner(System.in);
		LOGGER.info("enter housearea, material standard,automated status");
		int houseArea=s.nextInt();
		int standard=s.nextInt();
		int automated=s.nextInt();
		double result=c.constructionCost(houseArea,standard,automated);
		LOGGER.info("House Construction Cost is: "+result);
		s.close();

	}

}
