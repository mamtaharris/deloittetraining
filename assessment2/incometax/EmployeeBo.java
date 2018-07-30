package com.deloittetraining.assessment2.incometax;

public class EmployeeBo{
	public void calincomeTax (EmployeeVo ev) {
		//Assume that it is for regular customers
		
		if (ev.getAnnualincome() <= 250000)
			ev.setIncometax(0);
		else if (ev.getAnnualincome() <= 500000)
			ev.setIncometax(5/100 * ev.getAnnualincome());
		else if (ev.getAnnualincome() <= 1000000)
			ev.setIncometax(20/100 * ev.getAnnualincome());
		else
			ev.setIncometax(30/100 * ev.getAnnualincome());
	}
}
