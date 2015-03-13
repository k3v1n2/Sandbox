package com.example;

/**
 * Created by kjw on 3/13/15.
 */
public class User {

    public enum GENDER {
        MALE("Male"), FEMALE("Female");

        private String type;

        GENDER(String type) {
            this.type = type;
        }
    }

    private String name;
    private int age;
    private GENDER gender;

    public User(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Name: " + this.name);
        stringBuffer.append("\n");
        stringBuffer.append("Age: " + this.age);
        stringBuffer.append("\n");
        stringBuffer.append("Gender: " + this.gender.type);
        return stringBuffer.toString();
    }
}
