package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scoresString = fileContent();
        int[] scoresArr = Arrays.stream(scoresString.split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> scores = new ArrayList<>();
        for (int score : scoresArr) {
            if (score >= 0 && score <= 100) {
                scores.add(score);
            }
        }
        histogram(scores);
    }

    public static void histogram(ArrayList<Integer> list) {
        for (int i = 0; i <= 100; i += 10) {
            if (i < 100) {
                System.out.println(String.format("%02d", i) + "-" + String.format("%02d", i + 9) + ":" + "*".repeat(filter(list, i, i + 9)));
            } else {
                System.out.println("  100:" + "*".repeat(filter(list, i, i + 9)));
            }
        }
    }

    public static int filter(ArrayList<Integer> list, int min, int max) {
        int count = 0;
        for (int element : list) {
            if (element >= min && element <= max) {
                count++;
            }
        }
        return count;
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return String.join(" ", Files.readAllLines(path, charset));
        //return Files.readAllLines(path, charset).stream()
        //        .findFirst()
        //        .orElseThrow(IllegalStateException::new);
    }
}
