package com.santhosh.springbootstarter.topics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRespository extends CrudRepository<Topic,String> {

}
