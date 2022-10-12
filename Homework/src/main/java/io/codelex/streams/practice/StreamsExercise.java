package io.codelex.streams.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(number -> (int) Math.sqrt(number)).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return users.stream().filter(user -> user.getAge() > 25).collect(Collectors.toList()).size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(User::getAge).average().orElse(0);
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).max().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElse(0);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(user -> user.isMale()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(user -> user.getAge()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(user -> user.isMale(), Collectors.groupingBy(user -> user.getAge())));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().filter(user -> user.getAge() == age).collect(Collectors.toList()).size() != 0;
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().filter(user -> user.getAge() == age).collect(Collectors.toList()).size() == 0;
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(n -> isPrime(n)).limit(10).boxed().collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints().limit(10).boxed().collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().collect(Collectors.summarizingInt(User::getAge));
    }
}
