package com.martynuk.dao.impl;

import com.martynuk.dao.ClientDao;
import com.martynuk.domain.Client;

public class ClientDaoImpl implements ClientDao {

    @Override
    public boolean saveClient(Client client) {
        System.out.println("Saving.... Please wait");
        return true;
    }
}