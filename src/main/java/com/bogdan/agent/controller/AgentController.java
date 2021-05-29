package com.bogdan.agent.controller;

import com.bogdan.agent.model.Agent;
import com.bogdan.agent.service.AgentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AgentController {


    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping("/agent")
    public ResponseEntity<Agent> saveAgent(@RequestBody Agent agent) {
        return agentService
                .save(agent)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/agents")
    public ResponseEntity<List<Agent>> getAgents() {
        return agentService
                .getAll()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/agent/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Agent> getAgentById(@PathVariable String id) {
        return agentService
                .getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
