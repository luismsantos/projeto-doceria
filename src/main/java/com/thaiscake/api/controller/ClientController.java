package com.thaiscake.api.controller;

import com.thaiscake.api.domain.client.Client;
import com.thaiscake.api.domain.client.ClientRequestDTO;
import com.thaiscake.api.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody ClientRequestDTO body) {
        Client newClient = this.clientService.createClient(body);
        return ResponseEntity.ok(newClient);
    }

}
