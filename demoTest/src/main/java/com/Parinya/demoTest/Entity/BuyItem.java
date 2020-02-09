package com.Parinya.demoTest.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tor_BuyItem")
public class BuyItem {
    @Id
    @SequenceGenerator(name = "buy_seq", sequenceName = "buy_seq")
    @GeneratedValue(generator = "buy_seq", strategy = GenerationType.SEQUENCE)
    @Column(unique = true)

    private @NotNull Long buyItemId; 
    private @NotNull double price;
    private @NotNull int amount;
    private @NotNull String itemName; 

      

	public BuyItem() {	}


	public void setAmount(final int i) {
    }

    public void setPrice(final Double price2) {
    }

    public void setBuyItem(final String buyItem) {
    }

    public void setItemName(final String itemname) {
    }

    public BuyItem(@NotNull final double price, @NotNull final int amount, @NotNull final String itemName) {
          
        this.price = price;
        this.amount = amount;
        this.itemName = itemName;
    }



}
