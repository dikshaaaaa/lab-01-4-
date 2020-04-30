package com.labbook.lab4.Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.labbook.lab4.dto.EmployeeEx;
	@Configuration
	public class CollectionEmployee 
	{
		private List<EmployeeEx> emplist=new ArrayList<EmployeeEx>();
		
		@Bean
		public List<EmployeeEx> getEmpList()
		{
			emplist.add(new EmployeeEx(1,"Kartaveu Garg",40000.0));
			emplist.add(new EmployeeEx(2,"Ishita",75000.0));
			emplist.add(new EmployeeEx(3,"Shivam",30000.0));
			emplist.add(new EmployeeEx(4,"Gopal",995000.0));

			return emplist;
		}

}
