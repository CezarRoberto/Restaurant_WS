package restaurantproject.restuarantproject.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientService service;



    @GetMapping("/Client")
    public List<Client> getClient(){
       return service.getClient();
    }


    @PostMapping("/Client/addnew")
    public void addClient(@RequestBody Client client){
        service.addClient(client);
    }

    @PutMapping("/Client/{id}/edit")
    public void updateClient(@PathVariable("id") Integer id, @RequestBody Client client){
        service.updateClient(client);
    }
    
    @DeleteMapping("/client/{id}/delete")
    public void deleteClient(@PathVariable("id") Integer id){
        service.deleteFriend(id);
    }



}



