public class Person {
    String name;
    int age;
    String work;
    long salary;
    int phone;
    public Person(String name, int age, String work,long salary,int phone){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }
    public static int MaxValuePhone(Person [] person ) {
        int maxPhone = Integer.MIN_VALUE;
        for (Person people1 : person) {
            if (people1.phone > maxPhone) {
                maxPhone = people1.phone;
            }
        }

        return maxPhone;
    }
    public static int MinValuePhone(Person[] person) {
        int minPhone = Integer.MAX_VALUE;
        for (Person Minimum : person) {
            if (Minimum.phone < minPhone) {
                minPhone = Minimum.phone;
            }
        }
        return minPhone;
    }
    public static int MaxValueSalary(Person [] person){
        int maxSalary = Integer.MIN_VALUE;
        for( Person AgeOfPeople : person){
            if(AgeOfPeople.salary>maxSalary){
                maxSalary = (int) AgeOfPeople.salary;
            }
        }
        return maxSalary;

    }

    }


