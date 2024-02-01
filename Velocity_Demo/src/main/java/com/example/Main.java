package com.example;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        // Initialize Velocity engine
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        // Load template
        Template template = velocityEngine.getTemplate("\\Users\\Sandy\\MyPhoneData\\Project Task sts\\Velocity_Demo\\src\\main\\resources\\templates\\example.vtl");

        // Create data model
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("title", "Velocity Example");
        velocityContext.put("name", "World");

        // Process template and print output
        StringWriter stringWriter = new StringWriter();
        template.merge(velocityContext, stringWriter);
        System.out.println(stringWriter.toString());
    }
}
