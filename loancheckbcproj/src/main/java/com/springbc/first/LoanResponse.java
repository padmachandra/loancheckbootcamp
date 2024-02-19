package com.springbc.first;

public class LoanResponse {
	
	int approvedLoanAmount;
	int status;
	
	public int getApprovedLoanAmount() {
		return approvedLoanAmount;
	}
	public void setApprovedLoanAmount(int approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoanResponse [approvedLoanAmount=" + approvedLoanAmount + ", status=" + status + "]";
	}
	public LoanResponse(int approvedLoanAmount, int status) {
		super();
		this.approvedLoanAmount = approvedLoanAmount;
		this.status = status;
	}
	
	

}
