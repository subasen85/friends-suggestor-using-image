package com.mkyong.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mkyong.repository.FriendSuggestorRepository;
import com.mkyong.service.FriendSuggestorService;

@Service
public class FriendSuggestorServiceImpl implements FriendSuggestorService {

	@Autowired	FriendSuggestorRepository friendSuggestorRepository;
	
	

	
}
