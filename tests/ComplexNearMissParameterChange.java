package tests;
//Complex Near Miss (Parameter Change):
// File: ComplexNearMissParameterChange.java
public class ComplexNearMissParameterChange {
    public void process(String input, boolean flag) {
        if (flag) {
            System.out.println("Processing with flag: " + input);
            // ... additional complex logic with flag
        } else {
            System.out.println("Processing: " + input);
            // ... additional complex logic without flag
        }
    }

    // Intentionally similar method with a parameter change (Complex Near Miss)
    public void processNearMiss(int input, boolean flag) {
        if (flag) {
            System.out.println("Processing with flag: " + input);
            // ... additional complex logic with flag
        } else {
            System.out.println("Processing: " + input);
            // ... additional complex logic without flag
        }
    }
}

