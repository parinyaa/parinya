package com.Parinya.demoTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.ApplicationRunner;

import com.Parinya.demoTest.Entity.BuyItem;
import com.Parinya.demoTest.Entity.TodoList;
import com.Parinya.demoTest.Repository.BuyItemRepository;
import com.Parinya.demoTest.Repository.TodoListRepository;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class DemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}

	@Bean
	ApplicationRunner init(TodoListRepository todoRepository,BuyItemRepository buyItemRepository){
		return args ->{
			
			TodoList t1 = new TodoList(10,1);		
			todoRepository.save(t1);

			BuyItem b1 = new BuyItem(10,1,"มาม่า");
			buyItemRepository.save(b1);

		};
	}

}



