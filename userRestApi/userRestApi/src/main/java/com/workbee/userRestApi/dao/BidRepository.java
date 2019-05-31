package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Bid;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long>{

}
