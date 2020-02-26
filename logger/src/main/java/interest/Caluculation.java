package interest;

public class Caluculation {
	public float simpleInterest(int principal,int rateOfInterest,int time)
	{
		float interest;
		interest=(principal*time*rateOfInterest)/100;
		return interest;
		
	}
	public double compoundInterest(int principal,int rateOfInterest,int time)
	{
		double interest,amount;
		amount=principal*(Math.pow((1+(rateOfInterest/100.0)),time));
		interest=amount-principal;
		return interest;
		
	}
}
