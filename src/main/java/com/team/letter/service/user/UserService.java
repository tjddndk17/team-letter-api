package com.team.letter.service.user;

import com.team.letter.domain.user.User;
import com.team.letter.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User> all = userRepository.findAll();

        return all;
    }
}
