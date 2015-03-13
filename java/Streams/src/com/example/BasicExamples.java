package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kjw on 3/13/15.
 */
public class BasicExamples {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Billy", 30, User.GENDER.MALE),
                                         new User("Sarah", 32, User.GENDER.FEMALE),
                                         new User("Tim", 28, User.GENDER.MALE),
                                         new User("Mike", 34, User.GENDER.MALE),
                                         new User("Rachel", 26, User.GENDER.FEMALE));

        System.out.println(users.stream().count());

        users.stream()
             .filter((user) -> user.getAge() < 30)
             .forEach(System.out::println);

        System.out.println("---------");

        users.stream()
             .filter((user) -> User.GENDER.FEMALE.equals(user.getGender()))
             .forEach(System.out::println);
    }
}
