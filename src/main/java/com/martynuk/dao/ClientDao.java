package com.martynuk.dao;

import com.martynuk.domain.Client;

public interface ClientDao {

    boolean saveClient(Client client);
    List<Client> getAllClients;

}
