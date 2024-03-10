package org.example.serializabletest.access;

import java.io.InputStream;
import java.util.HashMap;

public class Main {
    public String publicData;
    protected String protectedData;
    String defaultData;
    private String privateData;

    public static void main(String[] args) {
        var a = new A();
    }
}

class A{
}

class B extends A{
}

