package com.rama.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.rama.entity.Citizen_SSA;
@Repository
@EnableJpaRepositories
public interface SSA_Repo extends JpaRepository<Citizen_SSA, Integer> {

}
