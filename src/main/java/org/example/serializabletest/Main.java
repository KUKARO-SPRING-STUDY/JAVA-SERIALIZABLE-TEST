package org.example.serializabletest;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("john_doe", "password123");

        // 객체를 직렬화하여 파일에 저장
        try {
            FileOutputStream fileOut = new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in user.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }

        // 파일에서 객체를 역직렬화하여 읽기
        try {
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User serializedUser = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized User:");
            System.out.println("Username: " + serializedUser.getUsername());
            System.out.println("Password: " + serializedUser.getPassword());
        } catch(IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
