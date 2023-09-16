package Example_17_11;

public class Person {
    int age;
    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException
            ("Ages must be more than 0. the Input is " + age);
        }
        this.age = age;
    }
}
