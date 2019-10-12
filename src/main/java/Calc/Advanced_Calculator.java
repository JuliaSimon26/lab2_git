package Calc;

public class Advanced_Calculator extends Calculator {
    private int buffer;
    private int operationBuffered;
    public Advanced_Calculator() {super();}

   public int calculate(int arg1, int arg2, int operation, boolean flagBufferedNumber, boolean flagBufferedOperation) throws Exception{
        if (!flagBufferedNumber && !flagBufferedOperation) {
            return calc(arg1, arg2, operation);
        }
        if (flagBufferedNumber && !flagBufferedOperation) {
            return calc(buffer, arg2, operation);
        }
        if (!flagBufferedNumber && flagBufferedOperation) {
            return calc(arg1, arg2, operationBuffered);
        }
        if (flagBufferedNumber && flagBufferedOperation) {
            return calc(buffer, arg2, operationBuffered);
        }
        return Integer.MIN_VALUE;
    }

    private int calc(int arg1, int arg2, int operation) throws Exception {
        operationBuffered = operation;
        switch (operation) {
            case 1:
                buffer = arg1 + arg2;
                break;
            case 2:
                buffer = arg1 - arg2;
                break;
            case 3:
                buffer = arg1 * arg2;
                break;
            case 4:
                buffer = arg1 / arg2;
                break;
            default:
                throw new Exception();
        }
        return buffer;
    }
}
