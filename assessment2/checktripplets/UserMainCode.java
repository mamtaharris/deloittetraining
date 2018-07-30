package com.deloittetraining.assessment2.checktripplets;

public class UserMainCode {
	static boolean checkTripplets(int[] a)
	{
		int i=0;
		int l =a.length;
		for(i=0;i<l;++i)
		{
			if(i==(l-2))
				break;
			if((a[i]==a[i+1])&&(a[i]==a[i+2]))
				return true;

		}
		return false;
	}
}
