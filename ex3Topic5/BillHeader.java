package ex3Topic5;

import java.text.DecimalFormat;
import java.util.Date;

public class BillHeader {
    // fill your code here
    DecimalFormat dc = new DecimalFormat("0.0");
    Date issueDate;
    Date dueDate;
    Double originalAmount;
    Double amountOutstanding;


    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Double getAmountOutstanding() {
        return amountOutstanding;
    }

    public void setAmountOutstanding(Double amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public BillHeader() {

    }

    public BillHeader(Date issueDate, Date dueDate, Double originalAmount, Double amountOutstanding) {
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.originalAmount = originalAmount;
        this.amountOutstanding = amountOutstanding;

    }

    public void display() {
        System.out.println("Issue date: " + this.getIssueDate());
        System.out.println("Due Date: " + this.dueDate);
        System.out.println("Original amount Rs." + dc.format(this.getOriginalAmount()));
        System.out.println("Amount outstanding Rs." + dc.format(this.getOriginalAmount() - this.getAmountOutstanding()));
    }

}
