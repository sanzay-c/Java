public class SeniorDeveloper extends Developer {
    private double salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;

    // parameterized constructor
    public SeniorDeveloper(String platform, String interviewerName, int workingHour, double salary, int contractPeriod){
        super(platform, interviewerName, workingHour);
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;
    }

    // getter method 
    public double getSalary(){
        return salary;
    }

    // getter method 
    public String getJoiningDate(){
        return joiningDate;
    }
 
    // getter method 
    public String getStaffRoomNumber(){
        return staffRoomNumber;
    }

    // getter method  
    public int getContractPeriod(){
        return contractPeriod;
    }

    // getter method 
    public double getAdvanceSalary(){
        return advanceSalary;
    }

    // getter method 
    public boolean getAppointed(){
        return appointed;
    }

    // getter method 
    public boolean getTerminated(){
        return terminated;
    }
    
    // setter method 
    public void setSalary(double salary){
        this.salary = salary;
    }

    // setter method
    public void setContractPeriod(int contractPeriod){
        this.contractPeriod = contractPeriod;
    }

    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber){
        if (appointed == true){
            System.out.println("The developer is already apppointed.");
            System.out.println("The Staff room number is: " + staffRoomNumber); 
        }else {
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.appointed = false;
            this.terminated = true;
        }
    }

    public void contractTerminated(){
        if (terminated == true){
            System.out.println("The developer is terminated.");
        }else{
            super.setDeveloperName("");
            this.joiningDate = "";
            this.advanceSalary = 0.0;
            this.appointed = false;
            this.terminated = true;
        }
    }

    public void print(){
        System.out.println("Platform is: " + super.getPlatform());
        System.out.println("Interviewer name is: " + super.getInterviewerName());
        System.out.println("Salary is: " + salary);
    } 
    
    public void display(){
        super.display();
        if (appointed == true){
            System.out.println("termination status is: " + terminated);    
            System.out.println("The joning date is: " + joiningDate);
            System.out.println("The advance salary is: " + advanceSalary);
            System.out.println("The developer name is: " + super.getInterviewerName());
        }
    }
}