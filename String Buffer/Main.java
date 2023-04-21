public class Main {
    public static void main(String[] args) {
      
        MyStringBuffer string = new MyStringBuffer("Yousif");

        string.print();
        System.out.println(string.indexOf('u'));
        System.out.println(string.length());
        string.erase(2,2);
        string.print();
        string.insert(2,"us");
        string.print();


    }
}
