# Java Swing Calculator for Two Numbers

A simple Java Swing-based calculator application that performs basic arithmetic operations on two numbers.

## Features

- **User-friendly GUI**: Clean and intuitive interface built with Java Swing
- **Four basic operations**: Addition (+), Subtraction (-), Multiplication (×), Division (÷)
- **Input validation**: Prevents invalid input and provides helpful error messages
- **Division by zero protection**: Handles division by zero with appropriate error messaging
- **Clear functionality**: Reset all fields with a single button
- **Result formatting**: Automatically formats results to remove unnecessary decimal places

## Requirements

- Java 8 or higher
- Graphics environment (GUI capable system)

## Compilation and Execution

### Compile the application:
```bash
cd src/main/java
javac Calculator.java
```

### Run the calculator:
```bash
java Calculator
```

### Run tests:
```bash
javac CalculatorTest.java
java CalculatorTest
```

## Usage Instructions

1. **Launch the application**: Run the calculator using the command above
2. **Enter first number**: Click on the "First Number" text field and enter your first number
3. **Enter second number**: Click on the "Second Number" text field and enter your second number
4. **Choose operation**: Click one of the operation buttons:
   - **+** for addition
   - **-** for subtraction
   - **×** for multiplication
   - **÷** for division
5. **View result**: The result will appear in the "Result" field
6. **Clear**: Click the "Clear" button to reset all fields and start over

## Error Handling

The calculator includes robust error handling for:
- **Empty fields**: Prompts user to enter both numbers
- **Invalid input**: Detects non-numeric input and displays error message
- **Division by zero**: Prevents division by zero and shows warning dialog

## Examples

- Addition: 5 + 3 = 8
- Subtraction: 10 - 4 = 6
- Multiplication: 6 × 7 = 42
- Division: 20 ÷ 4 = 5
- Decimal support: 3.14 + 2.86 = 6

## Project Structure

```
src/main/java/
├── Calculator.java      # Main calculator GUI application
└── CalculatorTest.java  # Unit tests for calculator operations
```

## License

This project is open source and available under the MIT License.
