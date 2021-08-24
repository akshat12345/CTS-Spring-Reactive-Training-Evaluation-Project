package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private Integer loanId;

	@Column(name = "loan_type")
	private String loanType;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "rate_of_interest")
	private Integer rateOfInterest;

	@Column(name = "loan_date")
	private Date loanDate;

	@Column(name = "acc_id")
	private Date accId;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(Integer loanId, String loanType, Integer amount, Integer duration, Integer rateOfInterest,
			Date loanDate, Date accId) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.amount = amount;
		this.duration = duration;
		this.rateOfInterest = rateOfInterest;
		this.loanDate = loanDate;
		this.accId = accId;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", amount=" + amount + ", duration=" + duration
				+ ", rateOfInterest=" + rateOfInterest + ", loanDate=" + loanDate + ", accId=" + accId + "]";
	}

	public Date getAccId() {
		return accId;
	}

	public void setAccId(Date accId) {
		this.accId = accId;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Integer rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

}
