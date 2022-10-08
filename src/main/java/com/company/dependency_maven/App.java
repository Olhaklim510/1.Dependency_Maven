package com.company.dependency_maven;

import com.company.dependency_maven.model.User;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        User user=new User("Olha","Pashkova");
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(user));
    }
}
