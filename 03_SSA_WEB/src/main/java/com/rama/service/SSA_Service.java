package com.rama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.repo.SSA_Repo;

@Service
public class SSA_Service {
	@Autowired
	private SSA_Repo r;
}
