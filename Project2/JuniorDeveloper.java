public class JuniorDeveloper extends Developer{
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    public JuniorDeveloper(String platform, String interviewerName, int workingHour, double salary, String appointedBy, String terminationDate){
        super(platform, interviewerName, workingHour);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization= "";
        this.joined = false;
    }

    // getter method 
    public double getSalary(){
        return salary;
    }

    // getter method 
    public String getAppointedDate(){
        return appointedDate;
    }

    // getter method 
    public String getEvaluationPeriod(){
        return evaluationPeriod;
    }

    // getter method 
    public String getTermiantionDate(){
        return terminationDate;
    }

    // getter method 
    public String getSpecialization(){
        return specialization;
    }

    // getter method
    public String getAppointedBy(){
        return appointedBy;
    }

    // getter method 
    public boolean getJoined(){
        return joined;
    }
 
    // setter method 
    public void setSalary(double salary){
        if (joined == false){
            this.salary = salary;
        } else {
            System.out.println("Not possible to change the salary");
        }
    }

    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization){
        if (joined == false){
            super.setDeveloperName(developerName);
            joined = true;
        } else {
            System.out.println("Developer is already appointed in: " + appointedDate);
        }
        this.appointedDate = appointedDate;
        this.terminationDate = terminationDate;
        this.specialization = specialization;
    }

    public void display(){
        super.display();
        if (joined == true){
            System.out.println("Appointed date is: " + appointedDate);
            System.out.println("Developer name is: " + super.getDeveloperName());
            System.out.println("Evaluation period is: " + evaluationPeriod);
            System.out.println("Termination date is: " + terminationDate);
            System.out.println("Salary is: " + salary);
            System.out.println("Developer specializaion is: " + specialization);
            System.out.println("Appointed by: " + appointedBy);
        }
    }
}