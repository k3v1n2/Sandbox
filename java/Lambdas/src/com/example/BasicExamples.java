package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by kjw on 3/13/15.
 */
public class BasicExamples {

    public static void printColor(String color, Printer printer) {
        printer.print(color);
    }

    public static void printColorStandardInterface(String color, Consumer<String> consumer) {
        consumer.accept(color);
    }

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

        System.out.println("---------");

        BasicExamples.printColor(colors[0], (color) -> System.out.println(color));

        System.out.println("---------");

        colorList.forEach((selectedColor) -> BasicExamples.printColor(selectedColor, (color) -> System.out.println(color)));

        System.out.println("---------");

        colorList.forEach((selectedColor) -> BasicExamples.printColorStandardInterface(selectedColor, (color) -> System.out.println(color)));
    }
}
