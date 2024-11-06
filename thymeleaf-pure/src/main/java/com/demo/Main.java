package com.demo;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        ITemplateEngine engine = createEngine();
        Context context = new Context();
        context.setVariable("name", "Pesho");

        StringWriter writer = new StringWriter();

        engine.process("test.html", context, writer);

        System.out.println(writer.toString());
    }

    private static ITemplateEngine createEngine() {
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(new ClassLoaderTemplateResolver());
        return engine;
    }
}