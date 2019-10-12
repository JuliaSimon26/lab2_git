package Calc;
public class Calculator {
    public Calculator() {}
   public int calculate(int arg1, int arg2, int operation) throws Exception{
        return this.calc(arg1, arg2, operation);
    }
    private int calc(int arg1, int arg2, int operation) throws Exception {
        switch (operation) {
            case 1:
                return arg1 + arg2;
            case 2:
                return arg1 - arg2;
            case 3:
                return arg1 * arg2;
            case 4:
                return arg1 / arg2;
            default:
                throw new Exception();
        }
    }
}