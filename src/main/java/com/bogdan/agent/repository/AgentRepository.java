package com.bogdan.agent.repository;

import com.bogdan.agent.model.Agent;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgentRepository extends CouchbaseRepository<Agent, String> {
}