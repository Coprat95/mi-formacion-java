package zona_fit.service;

import zona_fit.domain.Client;

import java.util.List;

public class ClientDAO implements IClientDAO {



    @Override
    public List<Client> listClients() {
        return List.of();
    }

    @Override
    public boolean findForClientId(Client client) {
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }

}



