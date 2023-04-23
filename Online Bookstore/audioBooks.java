import java.time.LocalDate;
public class audioBooks extends Books {

    private double lengthInMinutes;

    public audioBooks(String title, LocalDate  releaseDate, double price,double lengthInMinutes){
        super(title,releaseDate,price);
        this.lengthInMinutes = lengthInMinutes;
    }
    public double getLenghtInMinutes(){
        return lengthInMinutes;
    }

//    public void printBook(){
//        super.printBook();
//        System.out.println("The Length in minutes of the book = "+ lengthInMinutes);
//    }

    @Override
    public String toString() {
        return super.toString() + "Lenght in minutes = "+lengthInMinutes+"\n";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) // if the comparing is the same thing
            return true;

        if (!(obj instanceof audioBooks)) // If the obj not instace of the class
            return false;

        if (!super.equals(obj)) // If the obj not equals in the super
            return false;

        if (this.lengthInMinutes == ((audioBooks) obj).lengthInMinutes) // true if the obj same number of page
            return true;

        return false;
    }
}
