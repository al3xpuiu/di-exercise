package com.bishoptod3.diexercise;

import com.bishoptod3.diexercise.controllers.ConstructurInjectedController;
import com.bishoptod3.diexercise.controllers.MyController;
import com.bishoptod3.diexercise.controllers.PropertyInjectedController;
import com.bishoptod3.diexercise.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExerciseApplication.class, args);
		MyController controller = (MyController) ctx.getBean( "myController" );

		System.out.println(controller.hello());
		System.out.println(ctx.getBean( ConstructurInjectedController.class).sayHello());
		System.out.println(ctx.getBean( SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean( PropertyInjectedController.class ).sayHello());
	}
}
