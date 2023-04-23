import java.time.LocalDate;

public class Books {


    static int idCounter=1;
    private int ID;
    private String title;
    private LocalDate  releaseDate;
    private double price;

    public Books(String title, LocalDate releaseDate, double price) {
        this.ID = idCounter++;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public int getID(){
        return ID;
    }
    public String getTitle(){
        return title;
    }
    public LocalDate  getReleaseDate(){
        return releaseDate;
    }
    public double getPrice(){
        return price;
    }

    public void printBook() {
        System.out.println(this);
//        System.out.println("The ID of the book = " + ID);
//        System.out.println("The title of the book = " + title);
//        System.out.println("The release Date of the book = " + releaseDate);
//        System.out.println("The Price of the book = " + price);
    }

     @Override
    public String toString(){
            return "ID = " + this.ID + "\n" + "The Title = " + this.title +"\n"+"The release Date = "+this.releaseDate
                    +"\n"+"The Price = "+this.price+"\n";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) // If the comparing is the same thing
            return true;

        if (!(obj instanceof Books)) // If the obj not instace of the super class
            return false;

        if (this.title.equalsIgnoreCase(((Books)obj).title) && this.releaseDate.equals(((Books)obj).releaseDate))
            return true;  // comparing the title and release date

        return false;
    }
}
