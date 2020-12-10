package com.qa;

public class Factorials {
	
	private int number;
	
	public Factorials(int number)
	{
		this.number = number;
	}
	
	public int getFactorial()
	{
		int i = 2;
		while (true)
		{
			if(getNumber()==1)
			{
				return i-1;
			}
			if(getNumber()/2 < 1)
			{
				return 0;
			}
			setNumber(getNumber()/i);
			i++;
		}
	}
	
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int num)
    {
        this.number = num;
    }
}
