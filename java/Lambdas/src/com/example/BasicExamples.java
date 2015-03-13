package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kjw on 3/13/15.
 */
public class BasicExamples {

    public static void main(String[] args) {

        String[] colors = {"blue", "black", "green", "red", "yellow", "purple"};
        List<String> colorList = Arrays.asList(colors);

        for(String color : colors) {
            System.out.println(color);
        }

        System.out.println("---------");

        colorList.forEach((color) -> System.out.println(color));

        System.out.println("---------");

        colorList.forEach(System.out::println);
    }
}
