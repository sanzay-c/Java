package Assignment.Inheritance;

public class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void display(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
    }
}
