
public class twoNumber {

    private int number1,number2;

    public twoNumber(){
        this.number1 = 0;
        this.number2 = 0;
    }

    public twoNumber(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int Sum(){
        return number1+number2;
    }

    public int Difference(){
        return number1-number2;
    }

    public int Product(){
        return number1*number2;
    }

    public int Quotient(){
        return number1/number2;
    }

    public int Remainder(){
        return number1%number2;
    }

}
