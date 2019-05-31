package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
