public class CalculatorTest {
    
    public static void main(String[] args) {
        System.out.println("Testing Calculator Operations...");
        
        // Test addition
        double result1 = performOperation(5.0, 3.0, "add");
        assert result1 == 8.0 : "Addition test failed: expected 8.0, got " + result1;
        System.out.println("Addition test passed: 5 + 3 = " + result1);
        
        // Test subtraction
        double result2 = performOperation(10.0, 4.0, "subtract");
        assert result2 == 6.0 : "Subtraction test failed: expected 6.0, got " + result2;
        System.out.println("Subtraction test passed: 10 - 4 = " + result2);
        
        // Test multiplication
        double result3 = performOperation(6.0, 7.0, "multiply");
        assert result3 == 42.0 : "Multiplication test failed: expected 42.0, got " + result3;
        System.out.println("Multiplication test passed: 6 × 7 = " + result3);
        
        // Test division
        double result4 = performOperation(20.0, 4.0, "divide");
        assert result4 == 5.0 : "Division test failed: expected 5.0, got " + result4;
        System.out.println("Division test passed: 20 ÷ 4 = " + result4);
        
        // Test division by zero (should return Double.POSITIVE_INFINITY or handle gracefully)
        try {
            double result5 = performOperation(10.0, 0.0, "divide");
            System.out.println("Division by zero handling: 10 ÷ 0 = " + result5);
        } catch (Exception e) {
            System.out.println("Division by zero properly handled with exception");
        }
        
        System.out.println("All calculator operation tests completed successfully!");
    }
    
    /**
     * Helper method to perform calculator operations for testing
     */
    public static double performOperation(double first, double second, String operation) {
        switch (operation) {
            case "add":
                return first + second;
            case "subtract":
                return first - second;
            case "multiply":
                return first * second;
            case "divide":
                if (second == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return first / second;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}