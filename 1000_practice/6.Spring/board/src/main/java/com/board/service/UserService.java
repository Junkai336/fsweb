package com.board.service;

import com.board.dto.JoinRequest;
import com.board.dto.LoginRequest;
import com.board.entity.User;
import com.board.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
//import javax.transaction.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    // 이거 지워야 하는데 왜 계속 오류 뜨는지 모르겠음. 필드주입? autowired? 생성자주입? repository에는 아무것도 안쓰는데?
//     기본 생성자가 아닌 다른 생성자가 필요하다는 말인데, 원리를 모르겠다.
    // => 필드주입, 생성자주입을 하면 한 번 쓰면 사라진다. 공통의 Service,Repository를 쓰기 위한 것
    // 그렇지 않으면, new로 여러번 생성해야 한다. (필드나 생성자가 얽히기 때문인 듯 함. 한번 지정하면 어쨋든 계속 남으니깐.)
//    @Autowired
//    @AllArgsConstructor
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public boolean checkLoginIdDuplicate(String loginId) {
        return userRepository.existsByLoginId(loginId);
    }

    public boolean checkNicknameDuplicate(String nickname) {
        return userRepository.existsByNickname(nickname);
    }

    public void join(JoinRequest req) {
        userRepository.save(req.toEntity());
    }

    public User login(LoginRequest req) {
        Optional<User> optionalUser = userRepository.findByLoginId(req.getLoginId());

        if (optionalUser.isEmpty()) {
            return null;
        }

        User user = optionalUser.get();

        if(!user.getPassword().equals(req.getPassword())) {
            return null;
        }

        return user;
    }

    public User getLoginUserByLoginId(String loginId) {
        if(loginId == null) return null;

        Optional<User> optionalUser = userRepository.findByLoginId(loginId);
        if(optionalUser.isEmpty()) return null;

        return optionalUser.get();
     }


}


// transactional?
// bean?
// optional에 대해서.

// getter가 있는데 왜 작동을 안하는거임