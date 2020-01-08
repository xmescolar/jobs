package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {
	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				//Boss gains 50% more of salaryPerMonth.  
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				//Manager gains 10% more of salaryPerMonth.  
				return salaryPerMonth*1.1;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				//Employee gains 15% less of salaryPerMonth. 
				return salaryPerMonth*0.85;
			}
		};
	}

	/*
	@Override
	public String toString() {
		return "PaymentFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	*/
	
	/*
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				//Volunteer gains no salaryPerMonth. 
				return 0;
			}
		};
	}*/
	
}
