package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Cible;

@Repository

public interface CibleRepository extends JpaRepository<Cible, Long> {

}
