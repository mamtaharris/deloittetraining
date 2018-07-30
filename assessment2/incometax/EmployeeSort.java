package com.deloittetraining.assessment2.incometax;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo>{

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		if (o1.incometax > o2.incometax)
			return 1;
		return -1;
	}

}
