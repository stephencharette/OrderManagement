package com.ordermanagement.createorder;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
  MenuItem findById(long id);
}