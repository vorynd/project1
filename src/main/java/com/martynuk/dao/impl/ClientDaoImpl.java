package com.martynuk.dao.impl;

import com.martynuk.dao.ClientDao;
import com.martynuk.domain.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map

public class ClientDaoImpl implements ClientDao {

    private Map<Long, Client> map = new HashMap<>();
    private static long generator =0;

    @Override
    public boolean saveClient(Client client) {
        client.setId(generator++);
        map.put(client.getId(), client);
        System.out.println("Saving.... Please wait");
        return true;
    }
    @Override
    public List<Client> getAllClients(){
        return new ArrayList<>(map.values());
    }
    public  static ClientDao getInstance(){
        return ClientDao;

    }

}
