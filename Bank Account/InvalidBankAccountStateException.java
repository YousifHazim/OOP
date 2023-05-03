public class InvalidBankAccountStateException extends RuntimeException {

    public InvalidBankAccountStateException(String message){ // unchecked exception
        super(message);
    }

}
