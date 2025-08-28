package jif3;

public interface InterfaceNesting {
    int INTERFACE_CONSTANT = 42;

    void interfaceMethod();

    /*
     * Nested interface inside another interface
     * This is implicitly static and public
     */
    interface NestedInterface {
        void nestedMethod();
    }
}
