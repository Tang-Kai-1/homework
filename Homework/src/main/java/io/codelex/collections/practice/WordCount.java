package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        long lines = Files.lines(path).count();
        int wordCount = 0;
        int chars = 0;
        ArrayList<String> words = (ArrayList<String>) Files.readAllLines(path, charset);
        for (String part : words) {
            chars += part.length();
            String[] wordsInPart = part.split(" ");
            for (String word : wordsInPart) {
                if (!word.equals("")) {
                    wordCount += 1;
                }
            }
        }
        System.out.println(lines);
        System.out.println(wordCount);
        System.out.println(chars);

    }
}
