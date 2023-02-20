package human.being;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Justin", LocalDate.of(1991, 12, 5));
        System.out.println(p1);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
    }
}