package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Service;



@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{

}
