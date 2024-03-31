package com.ordermanagement.createorder;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SizeRepository extends CrudRepository<Size, Long> {
  Size findById(long id);
}