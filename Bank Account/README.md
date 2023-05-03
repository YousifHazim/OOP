# Bank Account

The Program application representing a bank account.

## Files Description

• Main.java : This is the main class for the programe.

• bankAccount.java : have the methods for bank accounts.

• InvalidBankAccountStateException.java : have the Exception.

## Description

The class encapsulate the following fields: 

• an account number (encoded as a String).

• an account holder name (String).

• a balance (float).

• flag indicating whether the account is closed or open (boolean). 

The class have a constructor initializing all the fields.

Note that the flag not be passed as an argument to the constructor; instead, it be automatically initialized to indicate that the account is not closed. 

Note that if a method cannot perform the required action because the necessary condition is not satisfied, it should to throw a user-defined unchecked exception and keep the bank account object(s) unchanged.

In addition, the class have the following methods. 

• print(): a public method printing all the fields of a bank account.

• getBalance(): a public method returning the account balance.

• close(): a public method marking the account as closed only if the balance is zero and if the account is not already closed.

• reopen(): a public method marking the account as open only if the account is closed.

• deposit(float amount): a public method increasing the balance of the account by a given amount. The amount must be positive and the account must be open.

• withdraw(float amount): a public method decreasing the balance of the account by a given amount. The amount must be a positive value less than or equal to the account’s balance and the account must be open.

• transferTo(Account a, float amount): a public method
transferring the given positive amount from the current account to the passed account provided that both accounts are open and that the transferring account has a sufficient balance.

• printAll(Account[] as): a public static method that prints all the accounts of the passed array.

• find(Account[] as, String accountNum): a public static method returning the index of the account that has the passed account number in an array of accounts. It should return -1 in case a matching account is not found.

## The Output

![image](https://user-images.githubusercontent.com/105172397/235833413-17892d51-a842-44d6-860e-db3a36c72618.png)

```diff
- The program will not display any outputs, instead it will throw an InvalidBankAccountStateException with a message 

- “Cannot close an account that has money” thus ending the program.
```
