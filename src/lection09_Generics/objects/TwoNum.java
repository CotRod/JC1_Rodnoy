package lection09_Generics.objects;

import java.math.BigDecimal;

public class TwoNum <T extends Number, V extends Number> {
    private BigDecimal num1;
    private BigDecimal num2;
    public TwoNum( T num1 , V num2){
        this.num1 = BigDecimal.valueOf(num1.doubleValue());
        this.num2 = BigDecimal.valueOf(num2.doubleValue());
    }
    public double toSumUp(){
        BigDecimal result = num1.add(num2);
        return result.doubleValue();
    }
    public double toSubtract(){
        BigDecimal result = num1.subtract(num2);
        return result.doubleValue();
    }
    public double toMultiply(){
        BigDecimal result = num1.multiply(num2);
        return result.doubleValue();
    }
    public double toDivide(){
        BigDecimal result = num1.divide(num2);
        return result.doubleValue();
    }

}
