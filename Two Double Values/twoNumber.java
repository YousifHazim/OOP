
public class twoNumber {

    private double number1,number2;

    public twoNumber(){
        this.number1 = 0;
        this.number2 = 0;
    }

    public twoNumber(double number1,double number2){
        this.number1=number1;
        this.number2=number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double Sum(){
        return number1+number2;
    }

    public double Difference(){
        return number1-number2;
    }

    public double Product(){
        return number1*number2;
    }

    public double Quotient(){
        return number1/number2;
    }

    public double Remainder(){
        return number1%number2;
    }

}
