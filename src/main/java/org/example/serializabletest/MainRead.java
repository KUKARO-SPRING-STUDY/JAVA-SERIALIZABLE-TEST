package org.example.serializabletest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class MainRead {
    public static void main(String[] args) {
        try {
            String fileName = "userInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);


            UserInfo userInfo1 = (UserInfo) in.readObject();
            UserInfo userInfo2 = (UserInfo) in.readObject();
            List<UserInfo> userInfoList = (List<UserInfo>) in.readObject();

            System.out.println(userInfo1);
            System.out.println(userInfo2);
            System.out.println(userInfoList);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
