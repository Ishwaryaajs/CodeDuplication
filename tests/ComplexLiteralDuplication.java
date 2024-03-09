package tests;

// File: ComplexLiteralDuplication.java
public class ComplexLiteralDuplication {
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // Intentionally duplicated method with complex literal duplication
    public int calculatePerimeter(int a, int b, boolean flag) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            if (flag) {
                result += a * i;
                // ... additional complex logic with flag
            } else {
                result += a;
                // ... additional complex logic without flag
            }
        }
        return result;
    }
}
