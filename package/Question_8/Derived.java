package com.access.two;
import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        // privateMethod();  not accessible
        // defaultMethod();  not accessible
        protectedMethod(); //  accessible through inheritance
        publicMethod();    //  accessible
    }
}
