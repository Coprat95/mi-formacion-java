package zona_fit.service;

import zona_fit.domain.Client;

import java.util.List;

/**
 * Interface for Client data acces operations.
 * Provides methods to list, add , update and delete clients.
 */
public interface IClientDAO {
     List<Client> listClients();
     // Boolean returns values indicate whether the operation was succesfull
    //or  whether the record was found
     boolean findForClientId(Client client);
     boolean addClient(Client client);
     boolean updateClient(Client client);
     boolean deleteClient(Client client);

}
