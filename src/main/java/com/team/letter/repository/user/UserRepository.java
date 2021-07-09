package com.team.letter.repository.user;

import com.team.letter.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;


public interface UserRepository extends JpaRepository<User, Long> {

}
