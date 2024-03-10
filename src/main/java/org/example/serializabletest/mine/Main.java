package org.example.serializabletest.mine;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        TestRecord testRecord = new TestRecord("john_doe", "password123");
        try {
            String serializedObject = objectMapper.writeValueAsString(testRecord);
            System.out.println(serializedObject);
            System.out.println(objectMapper.readValue(serializedObject, TestRecord.class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
