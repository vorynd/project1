package com.martynuk.services.impl;



    import com.martynuk.dao.ClientDao;
import com.martynuk.dao.impl.ClientDaoImpl;
import com.martynuk.domain.Client;
import com.martynuk.services.ClientService;

    public class ClientServiceImpl implements ClientService {

        private ClientDao clientDao = new ClientDaoImpl();

        @Override
        public void createClient(String name, String surname, String phone) {
            Client client = new Client(name, surname, phone);
            boolean result = clientDao.saveClient(client);
            if (result) {
                System.out.println("Client Saved: " + client);
            }
        }

        @Override
        public void deleteClient() {

        }
}
