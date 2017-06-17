package com.friendsSuggestor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsSuggestor.model.FriendSuggestor;
import com.friendsSuggestor.repository.FriendSuggestorRepository;
import com.friendsSuggestor.service.FriendSuggestorService;



@Service
public class FriendSuggestorServiceImpl implements FriendSuggestorService {

	@Autowired	FriendSuggestorRepository friendSuggestorRepository;
	
	public FriendSuggestor save(FriendSuggestor friendSuggestor){
		FriendSuggestor frndSuggt = new FriendSuggestor();
		frndSuggt = friendSuggestorRepository.save(friendSuggestor);
		return frndSuggt;
	}

	@Override
	public FriendSuggestor read(String name, String identification) {
		FriendSuggestor friendSuggestor=friendSuggestorRepository.findFriendSuggestorByNameAndIdentification(name,identification);
		return friendSuggestor;
	}
	
}
