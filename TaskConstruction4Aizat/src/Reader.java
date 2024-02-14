import java.time.LocalDate;
import java.util.Date;

public class Reader {
    String fullName;
    int library;
    String cardNumber;
    LocalDate dateOfBirth;
    String phoneNumber;

    public Reader() {

    }
    public static void TakeBook(Reader reader) {
        reader.fullName = "Vasily Vladimirovich Petrov";
        reader.library = 3;
        reader.cardNumber = "3234243223";
        reader.dateOfBirth = LocalDate.of(1970, 02, 2);
        reader.phoneNumber = "2323423";
        System.out.println("He took:"+ " " + reader.library + " " + "Books");


    }

    public static int ReturnBook(Reader reader) {
        reader.fullName = "Vasily Vladimirovich Petrov";
        reader.library = 3;
        reader.cardNumber = "3234243223";
        reader.dateOfBirth = LocalDate.of(1970, 02, 2);
        reader.phoneNumber = "2323423";
        return reader.library;

    }
}


