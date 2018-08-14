package com.bishoptod3.diexercise;

import com.bishoptod3.diexercise.controllers.MyController;
import com.bishoptod3.diexercise.examplebeans.FakeDataSource;
import com.bishoptod3.diexercise.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExerciseApplication.class, args);
		MyController controller = (MyController) ctx.getBean( "myController" );

		FakeDataSource fakeDataSource = ctx.getBean( FakeDataSource.class );
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = ctx.getBean( FakeJmsBroker.class );
		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
	}
}
