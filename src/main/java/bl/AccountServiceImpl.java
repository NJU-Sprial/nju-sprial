package bl;


import blservice.AccountService;
import dataservice.UserDataService;
import enums.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    UserDataService service;

    @Override
    public UserType getUserType(String username) {
        return service.getUserType(username);
    }
}
