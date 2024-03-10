package org.example.serializabletest.access;

public class Sub {
    public void subMethod(Main main){
        main.publicData = "publicData";
        main.protectedData = "protectedData";
        main.defaultData = "defaultData";
        new A();
        // main.privateData = "privateData"; // privateData는 접근 불가
    }
}
