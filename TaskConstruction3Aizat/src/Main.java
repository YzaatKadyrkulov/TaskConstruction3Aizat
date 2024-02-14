
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] person = {new Person("Beknazar", 17, "Not job", 23332, 2000),
                new Person("Eldos", 18, "Not job", 13233, 3000),
                new Person("Nusya", 18, "Student", 13131, 4000),
                new Person("Nurmuhammed", 25, "Student", 131, 5000),
                new Person("Aidar", 18, "Student", 132, 6000),
        };
        System.out.println(Person.MaxValuePhone(person));
        System.out.println(Person.MaxValueSalary(person));
        System.out.println(Person.MinValuePhone(person));
    }
}

