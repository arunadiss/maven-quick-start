package com.aruna.learning;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
		System.out.println ("Greeting: Hello");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}