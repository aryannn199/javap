package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Initialize Spring ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // Retrieve the MovieDAO bean
        MovieDOA mdao = context.getBean("moviedao", MovieDOA.class);

        // Create movie objects
        Movie m1 = new Movie(1, "abc");
        Movie m2 = new Movie(2, "xyz");
        Movie m3 = new Movie(3, "mno");

        // Insert movies
        System.out.println("Insertion of movies:");
        System.out.println(mdao.insertMovie(m1));
        System.out.println(mdao.insertMovie(m2));
        System.out.println(mdao.insertMovie(m3));
        
        System.out.println();

        // Update a movie
        System.out.println("Updation of movie:");
        Movie m4 = new Movie(2, "uvw");
        System.out.println(mdao.updateMovie(m4));
        
        System.out.println();

        // Delete a movie
        System.out.println("Deletion of movie:");
        System.out.println(mdao.deleteMovie(m3));
    }
}
