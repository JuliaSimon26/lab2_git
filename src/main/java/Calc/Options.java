package Calc;

public class Options {
    private int operation;
    Options(String operation) {
        if ("+".equals(operation)) {
            this.operation = 1;
        } else if ("-".equals(operation)) {
            this.operation = 2;
        } else if ("*".equals(operation)) {
            this.operation = 3;
        } else if ("/".equals(operation)) {
            this.operation = 4;
        } else {
            this.operation = 0;
        }
    }
    int getOperation(){
        return operation;
    }
}

