public class Instrument {
    private int instrumentId;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int panNo;

    // parameterized constructer
    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
        this.instrumentId = 0;
        this.customerName = "";
        this.customerMobileNumber = "";
        this.panNo = 0;
    }
    
    // getter method
    public int getInstrumentId() {
        return instrumentId;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public int getPanNo() {
        return panNo;
    }

    // setter method
    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setPanNo(int panNo) {
        this.panNo = panNo;
    }
    
    // display method
    public void display(){
        System.out.println("The instrument id is: " + instrumentId);
        System.out.println("The instrument name is: " + instrumentName);
        if (customerName != "" && customerMobileNumber != "" && panNo != 0){
            System.out.println("The customer name is: " + customerName);
            System.out.println("The customer mobile number is: " + customerMobileNumber);
            System.out.println("The Pan No is: " + panNo);
        }
    }
}
