package AccountsInfo.project.controller;

import AccountsInfo.project.models.BankAccount;
import AccountsInfo.project.models.Users;
import AccountsInfo.project.repositories.RepoAccounts;
import AccountsInfo.project.repositories.RepoAllUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static java.util.regex.Pattern.matches;

@RestController
public class UserController {
    @Autowired
    private RepoAllUsers repo;

    @PostMapping(value="/add_newUser")  //SIGNUP
    public ResponseEntity<?> addUser(@RequestBody Users u){
        Users savedRec=this.repo.save(u);
        return ResponseEntity.ok(savedRec);
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        Optional<Users> optionalUser = repo.findByEmail(email);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            if (matches(password, user.getpass())) {
                // Successful login
               return ("Login Successful");
            }
            else  return ("email and pwd not matched...");
        }
        else  return ("email id not found");
}}
