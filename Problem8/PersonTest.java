package Problem8;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 25, "male");
        System.out.println("First name: " + person1.getFirstName());
        System.out.println("Last name: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        person1.setAge(30);
        System.out.println("New age: " + person1.getAge());

        Person person2 = new Person("Jane", "Doe", 30, "female");
        System.out.println("First name: " + person2.getFirstName());
        System.out.println("Last name: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());

        person2.setGender("male");
        System.out.println("New gender: " + person2.getGender());
    }
}
