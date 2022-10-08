public class Developer {
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHour;

    // using Developer as Parameterized constructor along with following attributes.
    public Developer(String platform, String interviewerName, int workingHour){
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHour = workingHour; 
        this.developerName = "";
    }

    // getter method. 
    public String getPlatform(){
        return platform;
    }

    // getter method.
    public String getInterviewerName(){
        return interviewerName;
    }

    // getter method 
    public String getDeveloperName(){
        return developerName;
    }

    // getter method.
    public int getWorkingHour(){
        return workingHour;
    }

    // setter method. 
    public void setDeveloperName(String developerName){
        this.developerName = developerName;
    }

    // using display() method to display
    public void display(){
        if(developerName != ""){
            System.out.println("The Developer name is: " + developerName);
        }
        System.out.println("The Platform is: " + platform);
        System.out.println("The Interviewer name is: " + interviewerName);
        System.out.println("The Working hour is: " + workingHour + " hrs");
    }
}
