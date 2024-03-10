package org.example.serializabletest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class MainWrite {
    public static void main(String[] args) {
        try {
            String fileName = "userInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo userInfo1 = new UserInfo("john_doe", "password123", 30);
            UserInfo userInfo2 = new UserInfo("jane", "password123", 25);

            List<UserInfo> userInfoList = List.of(userInfo1, userInfo2);

            out.writeObject(userInfo1);
            out.writeObject(userInfo2);
            out.writeObject(userInfoList);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
