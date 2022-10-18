package com.nisum.jenkinsDemo;

public class Calculator 
{ 
	public int sum(int...x)
	{
		int s =0;
		for(int i:x)
			s=s+i;
		return s;
	}
    public int square(int x)
    {
    	return x*x;
    }
    public int power(int x, int n)

    {
    	int res=1;
    	for(;n>0;n--)
    		res*=x;
    	return res;
    }
}
