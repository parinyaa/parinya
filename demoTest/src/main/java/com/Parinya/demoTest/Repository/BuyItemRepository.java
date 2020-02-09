package com.Parinya.demoTest.Repository;

import com.Parinya.demoTest.Entity.BuyItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BuyItemRepository extends JpaRepository<BuyItem, Long> {
     BuyItem findById(long buyItemId);
}
