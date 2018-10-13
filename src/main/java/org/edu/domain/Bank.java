package org.edu.domain;

import org.edu.exceptions.ClientExistsException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank implements Serializable {

    private final List<Client> clients = new ArrayList<>();


    public Bank() {
    }

    public void addClient(final Client client) throws ClientExistsException {
        clients.add(client);
    }

    public List<Client> getClients() {
        return Collections.unmodifiableList(clients);
    }
}




