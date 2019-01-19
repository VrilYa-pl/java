public class Calculator {

    private void checkIfNegative(int a, int b) {
        if (a<0 || b<0){
            throw new NegativeNumberException();
        }
    }

    public int add(int a, int b){
        checkIfNegative(a, b);
        return a+b;
    }


    public int substraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        if (b % 2 != 0){
            throw new NotEvenNumberException();
        }
        return a/b;
    }

    public class NegativeNumberException extends RuntimeException {
    }

    public class NotEvenNumberException extends RuntimeException {
    }
}
