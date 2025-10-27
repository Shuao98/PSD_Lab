package Lab7;

public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;
    public double calculate(double x, double y){
        if (this == Operation.PLUS) {
            return x+y;
        }else if(this == Operation.MINUS){
            return x-y;
        }else if(this ==Operation.TIMES){
            return x*y;
        }else if(this ==Operation.DIVIDE){
            return x/y;
        }
        return 0;
    }
}

