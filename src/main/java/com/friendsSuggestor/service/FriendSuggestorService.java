package com.friendsSuggestor.service;

import java.util.Map;

import com.friendsSuggestor.model.FriendSuggestor;

public interface FriendSuggestorService {

	public FriendSuggestor save(FriendSuggestor friendSuggestor);
	public FriendSuggestor read(String name, String identification);
	public void individualClear();
	public Map<Integer,String> readall();
	public void groupClear();
}

	