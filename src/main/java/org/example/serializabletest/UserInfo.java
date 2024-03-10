package org.example.serializabletest;

import java.io.Serializable;

public record UserInfo(String name, String password, int age) implements Serializable {

}
