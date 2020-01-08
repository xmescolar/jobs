package com.jobs.domain;

public class Boss extends AbsStaffMember {

    protected double salaryPerMonth;
    protected IPaymentRate paymentRate;
    
    //Constructor
    public Boss(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone);
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
		return "Boss [salaryPerMonth=" + salaryPerMonth + ", paymentRate=" + paymentRate.pay(salaryPerMonth) + "]";
	}

}
