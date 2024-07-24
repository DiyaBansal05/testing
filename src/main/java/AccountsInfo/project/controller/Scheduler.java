package AccountsInfo.project.controller;

import AccountsInfo.project.ProjectApplication;
import AccountsInfo.project.models.BankAccount;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import AccountsInfo.project.controller.EmailService.*;
@RestController
@Service
public class Scheduler {
    @Autowired
    EmailService es;
      @PostMapping("/chkScheduler")
      @Scheduled(cron = "* 57 20 * * *")    //cron format:- "sec min hours date month dayOfWeek"
      public void sendMail(){
        es.sendSimpleEmail("diyabansal2025@gmail.com","subject","text");
    }
}
