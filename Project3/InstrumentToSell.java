public class InstrumentToSell extends Instrument {
    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;
   
    // parameterized constructer
    public InstrumentToSell(String instrumentName, double price){
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    // getter methods
    public double getPrice() {
        return price;
    }
    
    public String getSellDate() {
        return sellDate;
    }
    
    public double getDiscountPercent() {
        return discountPercent;
    }
    
    public boolean getIsSold() {
        return isSold;
    }
    
    // setter methods
    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }
    
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    // set price method
    public void setPrice(double price) {
        if (isSold == false){
            this.price = price;
        } else {
            System.out.println("Not possible to change the price.");
        }
    }

    // sell instrument method
    public void sellInstrument(String customerName, String PhoneNumber, int panNo, String sellDate, double discountPercentage){
        if (isSold == false){
            System.out.println("The Instrument is sold out");
            System.out.println("The Customer name is: " + customerName);
            System.out.println("The Phone numbe is: " + PhoneNumber);
            System.out.println("The Pan No is: " + panNo);
        } else {
            this.sellDate = sellDate;
            this.discountPercent = discountPercentage;
            this.isSold = true;
        }
        super.setCustomerName(customerName);
        super.setCustomerMobileNumber(PhoneNumber);
        super.setPanNo(panNo);
        this.price = price - discountPercentage;
    }

    // display method
    public void display(){
        super.display();
        System.out.println("The price of the instrument is: " + price);
        if (isSold == true){
            System.out.println("The Customer name is: " + super.getCustomerName());
            System.out.println("The Phone Number is: " + super.getCustomerMobileNumber());
            System.out.println("The pan number is: " + super.getPanNo());
            System.out.println("The Sold date is: " + sellDate);
        }
    }
}