package com.board.repository;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.board.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByLoginId(String loginId);
    boolean existsByNickname(String nickname);

    Optional<User> findByLoginId(String loginId);

}
