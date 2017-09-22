package com.hinus.qa.data;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzlidandan1 on 2017/9/22.
 */
public class Question2AnswerData {
    private static Question2AnswerData ourInstance = null;

    public static Question2AnswerData getInstance() {
        if (ourInstance == null) {
            ourInstance = new Question2AnswerData();
        }
        return ourInstance;
    }

    private static Map<String, String> hashMap = null;
    private Question2AnswerData() {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        try {
            String path = Question2AnswerData.class.getResource("./../../../../qadict/qadict").getPath();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF-8"));
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Question2AnswerData.class.getResourceAsStream("qadict/qadict")));
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                String [] ls = line.split(",");
                if (ls.length >= 2) {
                    String key = ls[0];
                    String value = ls[1];
                    if (key != null && key.length() > 0) {
                        hashMap.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getAnswer(String question) {
        if (question != null && hashMap.containsKey(question)) {
            return hashMap.get(question);
        } else {
            return null;
        }
    }
}
