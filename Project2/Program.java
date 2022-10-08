public class Program {
    public static void main(String[] args) {
        SeniorDeveloper sDeveloper = new SeniorDeveloper("Andriod", "Ram", 9, 700000, 5);
        sDeveloper.display();

        System.out.println();

        JuniorDeveloper jDeveloper = new JuniorDeveloper("ios", "Hari", 8, 800000, "Shiv", "2027-12-16");
        jDeveloper.display();
    }    
}
 