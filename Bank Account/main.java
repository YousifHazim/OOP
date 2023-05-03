public class Main {
    public static void main(String[] args) {


        bankAccount accountOne = new bankAccount("54","Yousif",10000);
        bankAccount accountTwo = new bankAccount("53","Hazim",20000);

        try {
            accountOne.close();
            accountTwo.close();

            accountOne.reopen();
            accountTwo.reopen();

            accountOne.deposit(5000);
            accountTwo.deposit(5000);

            accountOne.withdraw(2000);
            accountTwo.withdraw(1000);

            accountOne.transferTo(accountTwo,4000);
            accountTwo.transferTo(accountOne,3000);

            accountTwo.print();
            accountOne.print();
        }
        catch (InvalidBankAccountStateException ex){
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
