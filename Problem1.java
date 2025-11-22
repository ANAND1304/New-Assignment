// Calculator using class and method
public class Problem1 {
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    // Main calculation method
    public double calculate() {
        return switch (operation.toLowerCase()) {
            case "addition", "add", "+" -> add();
            case "subtraction", "subtract", "-" -> subtract();
            case "multiplication", "multiply", "*" -> multiply();
            case "division", "divide", "/" -> divide();
            default -> throw new IllegalArgumentException(
                "Invalid operation: " + operation +
                ". Use: addition, subtraction, multiplication, division"
            );
        };
    }

    // Addition
    private double add() {
        return a + b;
    }

    // Subtraction
    private double subtract() {
        return a - b;
    }

    // Multiplication
    private double multiply() {
        return a * b;
    }

    // Division with error handling
    private double divide() {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    // Getters
    public double getA() { return a; }
    public double getB() { return b; }
    public String getOperation() { return operation; }

    // Setters
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setOperation(String operation) { this.operation = operation; }

    // Helper for printing
    private String getOperationSymbol() {
        return switch (operation.toLowerCase()) {
            case "addition", "add", "+" -> "+";
            case "subtraction", "subtract", "-" -> "-";
            case "multiplication", "multiply", "*" -> "*";
            case "division", "divide", "/" -> "/";
            default -> operation;
        };
    }

    @Override
    public String toString() {
        try {
            double result = calculate();
            return String.format("%.2f %s %.2f = %.2f", a, getOperationSymbol(), b, result);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== CALCULATOR DEMONSTRATION ===\n");

        Problem1 calc1 = new Problem1(10.5, 5.5, "addition");
        System.out.println("Test 1 - Addition:");
        System.out.println(calc1);
        System.out.println("Result: " + calc1.calculate());
        System.out.println();

        Problem1 calc2 = new Problem1(20.0, 7.5, "subtraction");
        System.out.println("Test 2 - Subtraction:");
        System.out.println(calc2);
        System.out.println("Result: " + calc2.calculate());
        System.out.println();

        Problem1 calc3 = new Problem1(6.0, 7.0, "multiplication");
        System.out.println("Test 3 - Multiplication:");
        System.out.println(calc3);
        System.out.println("Result: " + calc3.calculate());
        System.out.println();

        Problem1 calc4 = new Problem1(100.0, 4.0, "division");
        System.out.println("Test 4 - Division:");
        System.out.println(calc4);
        System.out.println("Result: " + calc4.calculate());
        System.out.println();

        Problem1 calc5 = new Problem1(10.0, 0.0, "division");
        System.out.println("Test 5 - Division by Zero:");
        try {
            System.out.println(calc5);
            System.out.println("Result: " + calc5.calculate());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        Problem1 calc6 = new Problem1(5.0, 3.0, "modulus");
        System.out.println("Test 6 - Invalid Operation:");
        try {
            System.out.println("Result: " + calc6.calculate());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        Problem1 calc7 = new Problem1(15.5, 2.5, "+");
        System.out.println("Test 7 - Shorthand (+):");
        System.out.println(calc7);
        System.out.println("Result: " + calc7.calculate());
        System.out.println();

        Problem1 calc8 = new Problem1(-10.5, 5.5, "subtract");
        System.out.println("Test 8 - Negative Numbers:");
        System.out.println(calc8);
        System.out.println("Result: " + calc8.calculate());
        System.out.println();

        Problem1 calc9 = new Problem1(10.123, 3.456, "multiply");
        System.out.println("Test 9 - Decimal Precision:");
        System.out.println(calc9);
        System.out.println("Result: " + calc9.calculate());
        System.out.println();

        System.out.println("Test 10 - Using Setters:");
        Problem1 calc10 = new Problem1(0, 0, "add");
        calc10.setA(25.0);
        calc10.setB(15.0);
        calc10.setOperation("division");
        System.out.println(calc10);
        System.out.println("Result: " + calc10.calculate());
    }
}
