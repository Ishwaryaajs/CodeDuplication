package tests;

// File: ComplexBehavioralDuplication.java
public class ComplexBehavioralDuplication {
    // Common behavior in different methods with complexity
    public class FirstBehavior {
        public void execute(int x, int y) {
            // ... common behavior with additional complexity
            int result = x * y + x;
            System.out.println("FirstBehavior - Executing with result: " + result);
        }
    }

    // Behavior duplicated in another method with additional complexity
    public class SecondBehavior {
        public void implement(int a, int b) {
            // ... duplicated common behavior with additional complexity
            int result = a * b - b;
            System.out.println("SecondBehavior - Implementing with result: " + result);
        }
    }
}

