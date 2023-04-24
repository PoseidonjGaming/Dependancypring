package fr.perso.mvc.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class MainClassContext {
    private final ApplicationContext context;

    public MainClassContext(ApplicationContext context) {
        this.context = context;
        Bakery bakery= (Bakery) context.getBean("bakery");
        System.out.println(bakery.getName());
        bakery.fetch();
    }


}
