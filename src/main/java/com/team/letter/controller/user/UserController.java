package com.team.letter.controller.user;

import com.team.letter.domain.user.User;
import com.team.letter.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public ResponseEntity<List<User>> userList() throws Exception {

        List<User> list = userService.findAll();

        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
}
