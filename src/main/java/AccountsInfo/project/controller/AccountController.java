package AccountsInfo.project.controller;

import AccountsInfo.project.models.BankAccount;
import AccountsInfo.project.repositories.RepoAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    @Autowired
    private RepoAccounts repo;

    @PostMapping("/add_account")
    public ResponseEntity<?> addAcct(@RequestBody BankAccount acc){
        BankAccount savedRec=this.repo.save(acc);
        return ResponseEntity.ok(savedRec);
    }

    @GetMapping("/getDetails")
    public ResponseEntity<?> getDetails(){
        return ResponseEntity.ok(this.repo.findAll());
    }
}
