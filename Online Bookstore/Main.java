import java.time.LocalDate;;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int counterOne = 1;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of books will you provide : "); // Number of Books
        int numberOfBooks = input.nextInt();

        Books[] books = new Books[numberOfBooks]; // Array of Audio books

        for (int i=0;i<numberOfBooks;i++)
        {
            System.out.println("Choose type of the book number : " + counterOne); // Type of The book
            System.out.println("1)Text Book     2)Audio Book");
            int typeOfBooks = input.nextInt();

            System.out.printf("Enter the title of the book :"); // Title of the book
            String titleOfBook = input.next();

            System.out.println("Enter release date day first then month then the year :"); // release date of the book
            System.out.printf("Day :");
            int d = input.nextInt();
            System.out.printf("Month :");
            int m = input.nextInt();
            System.out.printf("year :");
            int y = input.nextInt();

            System.out.printf("Enter the price of the book :"); // price of the book
            int priceOfBook = input.nextInt();

            if (typeOfBooks == 1)
            {
                System.out.printf("Enter the Number of the Pages of the book :"); // number of the pages of the book
                int numberOfPagesOfBook = input.nextInt();
                books[i] = new textBooks(titleOfBook,LocalDate.of(y,m,d),priceOfBook,numberOfPagesOfBook);

            }
            else if (typeOfBooks == 2)
            {
                System.out.printf("Enter the Lenght if Minutes of the book :"); // Lenght if Minutes of the book
                double lenghtMinutesOfTheBook = input.nextDouble();
                books[i] = new audioBooks(titleOfBook,LocalDate.of(y,m,d),priceOfBook,lenghtMinutesOfTheBook);
            }
            else {
                System.out.println("Please Choose Correct Type of the book");
                i--;
                continue;
            }

            counterOne++;
        }

        System.out.println();
        int counterTwo = 1;

        for (int i=0;i<numberOfBooks;i++)
        {
            System.out.println("The Book number "+counterTwo+" :");

            if (books[i] != null)
                books[i].printBook();

            System.out.println();

            counterTwo++;
        }

    }
}
