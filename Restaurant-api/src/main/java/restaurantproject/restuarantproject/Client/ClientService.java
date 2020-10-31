package restaurantproject.restuarantproject.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getClient() {
         return repository.findAll();   
    }

    public void addClient(Client client){
        repository.save(client);
    }

    public void updateClient(Client client){
        repository.save(client);
    }

    public void  deleteFriend(Integer id){
        repository.deleteById(id);

    }

}
