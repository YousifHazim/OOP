public class bankAccount {

    private String accountNumber;
    private String accountHolderName;
    private float balance;
    private boolean isClosed; // Flag

    public bankAccount(String accountNumber , String accountHolderName, float balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.isClosed = false;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public float getBalance(){
        return balance;
    }

    public void print(){
        System.out.println("The Account Number = " + accountNumber);
        System.out.println("The Account Holder Name = "+accountHolderName);
        System.out.println("The Balance = "+balance);
    }

    public void close(){

        if (isClosed){ // in case the user close the account
            throw new InvalidBankAccountStateException("The Account is already closed");
        }

        if (balance != 0){ // in case the account has the money
            throw new InvalidBankAccountStateException("Cannot close an account that has money");
        }

        isClosed = true; // in case the account has no money & not close before , it will close

    }

    public void reopen(){
        if (!isClosed){ // in case the Account is already open not close
            throw new InvalidBankAccountStateException("The Account is already open");
        }
        isClosed = false; // in case the Account is close , the it will open it
    }

    public void deposit(float amount){

        if (isClosed){ // in case the account is close
            throw new InvalidBankAccountStateException("The Account must be open");
        }

        if (amount <= 0){ // in case the number of deposit is zero or negative
            throw new IllegalArgumentException("The Amount must be Positive");
        }

        this.balance += amount; // add the amount to balance
    }

    public void withdraw(float amount){

        if (isClosed){ // in case the account is close
            throw new InvalidBankAccountStateException("The Account must be open");
        }

        if (amount > balance || amount <= 0){ // in case the amount is negative or less than the balance
            throw new IllegalArgumentException("The Amount should be positive and less or equal then the Balance");
        }

        this.balance -= amount; // sub the amount from the balance
    }

    public void transferTo(bankAccount secondAccount , float amount){

        if (this.isClosed || secondAccount.isClosed){ // in case one of the account is close
            throw new InvalidBankAccountStateException("The Account must be open");
        }

        if (amount <= 0 || amount > this.balance){ // in case the amount is negative or less than the balance
            throw new IllegalArgumentException("The Amount should be positive and less or equal then the Balance");
        }

        this.balance -= amount; // sub the amount from the balance "first account"
        secondAccount.balance += amount; // add the amount to the balance "second account"
    }

    public static void printAll(bankAccount[] Accounts){
        for (bankAccount account : Accounts){
            account.print(); // Print the print methods of all bank Accounts
        }
    }

    public static int find(bankAccount[] Accounts , String accountNumber){
        for (int i=0;i<Accounts.length;i++){
            if (Accounts[i].accountNumber.equals(accountNumber)){ // Search if equals
                return i; // return the index
            }
        }
        return -1; // if not return the value -1
    }

}
