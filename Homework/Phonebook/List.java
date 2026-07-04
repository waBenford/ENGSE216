public class List {
    Person[] data = new Person[5];
    int count;

    boolean isFull() {
        return count == data.length;
    }

    boolean isEmpty() {
        return count == 0;
    }

    public void add(Person p) {
        if (!isFull()) {
            data[count] = p;
            count++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            data[i].showInfo(i + 1);
        }
    }
}