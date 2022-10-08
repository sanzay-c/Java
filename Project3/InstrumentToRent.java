public class InstrumentToRent extends Instrument {
    private double chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private double noOfDays;
    private boolean isRented;

    // parameterized constructer
    public InstrumentToRent(String instrumentName, double chargePerDay){
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }

    // getter methods
    public double getChargePerDay() {
        return chargePerDay;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public double getNoOfDays() {
        return noOfDays;
    }

    public boolean getIsRented() {
        return isRented;
    }

    // setter methods
    public void setChargePerDay(double chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setNoOfDays(double noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }
    
    // rent instrumetn method
    public void rentInstrument(String customerName, String phoneNumber, int panNo, String dateOfRent, String dateOfReturn, String daysToBeRented){
        if (isRented == false){
            System.out.println("The customer name is: " + customerName);
            System.out.println("The Phone number is: " + phoneNumber);
            System.out.println("The return date is: " + daysToBeRented);
        } else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(phoneNumber);
            super.setPanNo(panNo);
        }
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.isRented = true;
    }

    // return instrument method
    public void returnInstrument(String customerName, String phone, int panNo, String returnDate, String rentDate, String noOfRentingDays){
        if (isRented == false){
            System.out.println("The instrument is not in rent.");
        } else {
            super.setCustomerName("");
            super.setCustomerMobileNumber("");
            super.setPanNo(0);
            this.dateOfRent = "";
            this.dateOfReturn = "";
            this.noOfDays = 0.0;
            this.isRented = false;
        }
    }
    
    // display method
    public void display(){
        super.display();
        if (isRented == true){
            System.out.println("The Renting Date is: " + dateOfRent);
            System.out.println("The Return Date is: " + dateOfReturn);
        }
    }
}
