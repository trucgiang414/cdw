package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
