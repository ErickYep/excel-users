import java.util.Random;

public class Human {
    private String firstName;
    private String lastName;
    private String email;
    private String number;
    private String Address;
    private int age;

    public Human(String name, String phoneNumber, String address) {
        String[] names = name.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
        this.email = names[0] + "_" + names[1] + "@gmail.com";
        this.number = phoneNumber;
        Address = address;
        this.age = new Random().nextInt(100);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + ',' + lastName + ',' + email + ','
                + number + ',' + Address + ',' + age ;
    }
}
