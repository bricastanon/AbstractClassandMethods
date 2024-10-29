package com.pluralsight;

public abstract class Animal {
    int age;
    String name;

// end it and declare it with a ";"
// enforce and organize exactly what every subclass of Animal has to have
// makes sure every single animal type is able to make noise
    public abstract void makeNoise();
}
