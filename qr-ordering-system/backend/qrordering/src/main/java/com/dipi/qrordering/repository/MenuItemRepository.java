package com.dipi.qrordering.repository;

import com.dipi.qrordering.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository
        extends JpaRepository<MenuItem, Long> {

}