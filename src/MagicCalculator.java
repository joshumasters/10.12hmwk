public class MagicCalculator extends Calculator{
     private double result;
    
    public MagicCalculator(){

    }

    public double squareRoot(int num1){
        result = Math.sqrt(num1);
        return result;
    }

    public double sin(int num1){
        result = Math.sin(num1);
        return result;
    }

    public double cosin(int num1){
        result = Math.cos(num1);
        return result;
    }

    public double tangent(int num1){
        result = Math.tan(num1);
        return result;
    }

}
