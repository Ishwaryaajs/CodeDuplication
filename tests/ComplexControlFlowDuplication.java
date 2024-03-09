package tests;

// File: ComplexControlFlowDuplication.java
public class ComplexControlFlowDuplication {
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    // Intentionally duplicated method with complex control flow duplication
    public int divideWithDuplication(int x, int y, boolean flag) {
        if (flag) {
            if (y != 0) {
                return x / y;
            } else {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        } else {
            if (y != 0) {
                // ... additional complex logic without flag
                return x / y;
            } else {
                // ... additional complex logic without flag
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        }
    }
}

