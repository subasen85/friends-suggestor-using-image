package com.mkyong.repository;

import java.math.BigInteger;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.mkyong.model.FriendSuggestor;


public interface FriendSuggestorRepository extends CrudRepository <FriendSuggestor,BigInteger>  {

}
