package tests;

// File: ComplexStructuralDuplication.java
public class ComplexStructuralDuplication {
    // Common structure in multiple classes with complexity
    public abstract class BaseClass {
        protected String name;

        public BaseClass(String name) {
            this.name = name;
        }

        public abstract void performAction();
    }

    // Duplicated structure in another class with additional complexity
    public class DerivedClass extends BaseClass {
        private int value;

        public DerivedClass(String name, int value) {
            super(name);
            this.value = value;
        }

        @Override
        public void performAction() {
            // ... duplicated common structure with additional complexity
            System.out.println("DerivedClass - Action performed: " + name + ", Value: " + value);
        }
    }
}
