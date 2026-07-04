public class Main {
    public static void main(String[] args) {
        List addList = new List();

        Person p1 = new Person("John", "Doe", "123-456-7890");
        Person p2 = new Person("Jane", "Smith", "098-765-4321");

        addList.add(p1);
        addList.add(p2);

        addList.showAll();
    }
}