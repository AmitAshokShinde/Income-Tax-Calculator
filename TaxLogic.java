package com.example.demo.model;

public class TaxLogic {
	public float getTax(int annualSalary, String gender) {
		float totalTax = 0;

		switch (gender) {
		case "male":
			if (annualSalary <= 250000) {
				totalTax = 0;
			} else if (annualSalary > 250000 && annualSalary <= 500000) {
				totalTax = annualSalary * (5.0f / 100.0f);
			} else if (annualSalary > 500000 && annualSalary <= 1000000) {
				totalTax = annualSalary * (10.0f / 100.0f);
			} else if (annualSalary >= 1000000) {
				totalTax = annualSalary * (20.0f / 100.0f);
			}
			break;

		case "female":
			if (annualSalary <= 500000) {
				totalTax = 0;
			} else if (annualSalary > 500000 && annualSalary <= 1000000) {
				totalTax = annualSalary * (5.0f / 100.0f);
			} else if (annualSalary >= 1000000) {
				totalTax = annualSalary * (10.0f / 100.0f);
			}
			break;
		}

		return totalTax;
	}
}



