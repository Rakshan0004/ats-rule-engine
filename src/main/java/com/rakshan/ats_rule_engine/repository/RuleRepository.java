package com.rakshan.ats_rule_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakshan.ats_rule_engine.entity.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long> {
}