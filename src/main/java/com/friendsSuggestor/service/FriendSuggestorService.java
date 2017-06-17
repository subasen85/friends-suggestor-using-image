package com.friendsSuggestor.service;

import java.util.List;

import com.friendsSuggestor.model.FriendSuggestor;

public interface FriendSuggestorService {

	public FriendSuggestor save(FriendSuggestor friendSuggestor);
	public FriendSuggestor read(String name, String identification);
	public List<FriendSuggestor> readAll();
	
}
	