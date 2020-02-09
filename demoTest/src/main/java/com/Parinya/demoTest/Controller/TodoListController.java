package com.Parinya.demoTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

import com.Parinya.demoTest.Entity.BuyItem;
import com.Parinya.demoTest.Entity.TodoList;
import com.Parinya.demoTest.Repository.BuyItemRepository;
import com.Parinya.demoTest.Repository.TodoListRepository;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:15432")
public class TodoListController {
    @Autowired
    private TodoListRepository todoListRepository;
    @Autowired
    private BuyItemRepository buyItemRepository;


    @GetMapping(path = "todo-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<TodoList> todoList() {
        return todoListRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping(path ="/todo-list/{saleItemId}/{price}/{amount}/{buyItemId}")
    public TodoList todoList(@PathVariable String todoList,@PathVariable Double price,@PathVariable int amount,@PathVariable long buyItemId){
        
        BuyItem buyItem = buyItemRepository.findById(buyItemId);

        TodoList to = new TodoList();
        to.setTodoList(todoList);
        to.setPrice(price);
        to.setAmount(amount);
        to.setBuyItem(buyItem);
        return todoListRepository.save(to);
      
    }

    @GetMapping(path = "buyItem", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<BuyItem> buyItem() {
        return buyItemRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping(path ="/buyItems/{buyItemId}/{price}/{amount}/{itemName}")
    public BuyItem buyItem(@PathVariable String buyItem,@PathVariable Double price,@PathVariable int amount,@PathVariable String itemName){

        BuyItem b = new BuyItem();
        b.setBuyItem(buyItem);
        b.setPrice(price);
        b.setAmount(amount);
        b.setItemName(itemName);

        buyItemRepository.save(b);
        return b;
      
    }


}








