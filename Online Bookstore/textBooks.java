import java.time.LocalDate;

public class textBooks extends Books{

    private int numberOfPage;

    public textBooks(String title, LocalDate  releaseDate, double price,int numberOfPage){
        super(title,releaseDate,price);
        this.numberOfPage = numberOfPage;
    }

    public int getNumberOfPage(){
        return numberOfPage;
    }

//    public void printBook(){
//        super.printBook();
//        System.out.println("The Number of the Pages of the book = "+ numberOfPage);
//    }

    @Override
    public String toString() {
        return  super.toString() + "Number of page=" + numberOfPage + "\n";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) // if the comparing is the same thing
            return true;

        if (!(obj instanceof textBooks)) // If the obj not instace of the class
            return false;

        if (!super.equals(obj)) // If the obj not equals in the super
            return false;

        if (this.numberOfPage == ((textBooks) obj).numberOfPage) // true if the obj same number of page
            return true;

        return false;
    }
}
