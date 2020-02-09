package com.Parinya.demoTest.Entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "tor_task")
public class TodoList {
    @Id
    @SequenceGenerator(name = "sale_seq", sequenceName = "sale_seq")
    @GeneratedValue(generator = "sale_seq", strategy = GenerationType.SEQUENCE)

    
    private @NotNull Long saleItemId;
    private @NotNull double price;
    private @NotNull int amount;

    @ManyToOne
    @JoinColumn(name = "buyItemId")
    private BuyItem buyItem;

    public TodoList(@NotNull double price, @NotNull int amount) {
        this.price = price;
        this.amount = amount;
    }

	public TodoList() {
	}

    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

	public void setTodoList(String todoList) {
    }

    public BuyItem getBuyItem() {
        return buyItem;
    }
    
    public void setBuyItem(BuyItem buyItem) {
        this.buyItem = buyItem;
    } 

}


