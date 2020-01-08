package com.jobs.domain;

public class Manager extends AbsStaffMember {

    protected double salaryPerMonth;
    protected IPaymentRate paymentRate;

    //Constructor
  
    public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
        super(name, address, phone);
        if(salaryPerMonth<0) throw new Exception();
        if(paymentRate==null) throw new Exception();

        this.salaryPerMonth = salaryPerMonth;
        this.paymentRate = paymentRate;
    }    
    
	@Override  
    public void pay() {
    	totalPaid = paymentRate.pay(salaryPerMonth);
    }

	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(IPaymentRate paymentRate) {
		this.paymentRate = paymentRate;
	}

	@Override
	public String toString() {
		return "Manager [salaryPerMonth=" + salaryPerMonth + ", paymentRate=" + paymentRate.pay(salaryPerMonth) + "]";
	}    

}
