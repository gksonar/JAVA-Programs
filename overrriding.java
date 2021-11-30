class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class Icici extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}


class Axis extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}
}

class Test2
{

	public static void main(string args[])
	{
		SBI s=new SBI();
		Icici i=new Icici();
		Axis a= new Axis();

		System.out.println("SBI ROI: "+s.getRateOfInterest());
		System.out.println("ICICI ROI: "+i.getRateOfInterest());
		System.out.println("AXIS ROI: "+sa.getRateOfInterest());
	}
}