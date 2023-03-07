package src.models;

public class Contract {
    private String contractNo;
    private String bookingCode;
    private long prepaymentAmount;
    private long totalPaymentAmount;
    private String CustomerCode;

    public Contract(String contractNo, String bookingCode, long prepaymentAmount, long totalPaymentAmount, String customerCode) {
        this.contractNo = contractNo;
        this.bookingCode = bookingCode;
        this.prepaymentAmount = prepaymentAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        CustomerCode = customerCode;
    }

    public Contract() {
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public long getPrepaymentAmount() {
        return prepaymentAmount;
    }

    public void setPrepaymentAmount(long prepaymentAmount) {
        this.prepaymentAmount = prepaymentAmount;
    }

    public long getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(long totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }
}