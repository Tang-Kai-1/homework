package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, Integer> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    //Not sure if this is right, but I have done as the README file instructed and 'fixed' the PhoneDirectory class.
    //As it was not specified that PhoneEntry class must be utilized, it was discarded in favor of using names as keys
    //and numbers as values.


    public int getNumber(String name) {
        if (data.containsKey(name)) {
            return data.get(name);
        }
        return -1;
    }

    public void putNumber(String name, String numberString) {
        if (name == null || numberString == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int number = Integer.parseInt(numberString);
        data.put(name, number);
    }

}
