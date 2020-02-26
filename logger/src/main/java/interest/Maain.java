package interest;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Maain {
	
	private static final Logger LOGGER=LogManager.getLogger(Maain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluculation c=new Caluculation();
		Scanner s=new Scanner(System.in);
		LOGGER.info("enter the principal,rate of interest and time");
		int principal=s.nextInt();
		int rateOfInterest=s.nextInt();
		int time=s.nextInt();
		float sInterest=c.simpleInterest(principal,rateOfInterest,time);
		double cInterest=c.compoundInterest(principal,rateOfInterest,time);
		LOGGER.info("Simple Interest is"+sInterest+"\nCompound Interest is"+cInterest);
		
		s.close();
		

	}

}
