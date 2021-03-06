package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Writer;



@Repository
public interface WriterRepository extends JpaRepository<Writer, Long> {

}
