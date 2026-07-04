public class Person {
    private String firstName;
    private String lastName;
    private String phone;

    public Person(String fName, String lName, String pNum) {
        firstName = fName;
        lastName = lName;
        phone = pNum;
    }

    public void showInfo(int order) {
        System.out.println(order + ". " + firstName + " " + lastName + " " + phone);
    }
}
