package com.friendsSuggestor.service;

import com.friendsSuggestor.model.FriendSuggestor;

public interface FriendSuggestorService {

	public FriendSuggestor save(FriendSuggestor friendSuggestor);
	public FriendSuggestor read(String name, String identification);
	
	public void individualClear();
	
	public void groupClear();
}
	