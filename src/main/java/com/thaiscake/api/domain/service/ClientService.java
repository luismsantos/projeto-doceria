package com.thaiscake.api.domain.service;

import com.thaiscake.api.domain.client.Client;
import com.thaiscake.api.domain.client.ClientRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public Client createClient(ClientRequestDTO data){
    Client newClient = new Client();
    newClient.setName(data.name());
    newClient.setAddress(data.address());
    newClient.setCpf(data.cpf());
    newClient.setAge(data.age());

    return newClient;
    }

}
