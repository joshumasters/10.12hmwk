public class Calculator {
    private int result;
    
    public Calculator(){

    }

    public int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2){
        result = num1 - num2;
        return result;
    }

    public int mulitply(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2){
        result = num1/num2;
        return result;
    }

    public int square(int num1){
        result = num1*num1;
        return result;
    }
}
