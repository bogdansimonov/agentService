package com.bogdan.agent.service;

import com.bogdan.agent.model.Agent;
import com.bogdan.agent.repository.AgentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AgentService {
    private final AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public Optional<List<Agent>> getAll() {
        log.info("About to get all agents from DB");
        return Optional.of(agentRepository.findAll());
    }

    public Optional<Agent> save(Agent agent) {
        log.info("About to save agent={} to DB", agent.getFirstName());
        return Optional.of(agentRepository.save(agent));
    }

    public Optional<Agent> getById(String id) {
        log.info("About to get agent by id={}", id);
        if (agentRepository.existsById(id)) {
            return agentRepository.findById(id);
        } else {
            return Optional.empty();
        }

    }

}
