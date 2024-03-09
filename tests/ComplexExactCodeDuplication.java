package tests;
// File: ComplexExactCodeDuplication.java
// Complex Exact Code Duplication:
public class ComplexExactCodeDuplication {
    public void complexMethodA(int x, int y) {
        int result = x + y;
        System.out.println("Result: " + result);
        // ... additional complex logic in block A
    }

    public void complexMethodB(int x, int y) {
        int result = x * y;
        System.out.println("Result: " + result);
        // ... additional complex logic in block B
    }

    // Intentionally duplicated method for testing (Complex Exact Code Duplication)
    public void complexMethodADuplicate(int x, int y) {
        int result = x + y;
        System.out.println("Result: " + result);
        // ... additional complex logic in block A (duplicated)
    }
}
