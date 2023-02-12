package Assignment.Inheritance;

public class B extends A{
    private String address;

    public B(String name, int age, String address){
        super(name, age);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void display(){
        super.display();
        System.out.println("The address is: " + address);
    }
}
