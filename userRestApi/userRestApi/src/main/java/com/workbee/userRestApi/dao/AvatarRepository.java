package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Avatar;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {





}
