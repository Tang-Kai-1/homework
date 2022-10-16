package io.codelex.testtwo.exercise4;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReverse reverse = new FileReverse("E:/Work/testFolder/testForFileReverse.txt");
        reverse.reverseFile();
    }
}
