package com.example.firstproject.service;

import com.example.firstproject.dto.CoffeeDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public Iterable<Coffee> index(){
        return  coffeeRepository.findAll();
    }


    public Coffee create(CoffeeDto dto) {
    Coffee coffee = dto.toEntity();
        if (coffee.getId() != null) {
        return null;
        }
        return coffeeRepository.save(coffee);

    }


    public Coffee update(Long id, CoffeeDto coffeeDto) {
        Coffee coffee = coffeeDto.toEntity();
        log.info("id: {}, coffee: {}", id, coffee.toString());

        Coffee target = coffeeRepository
                .findById(id)
                .orElse(null);

        if(target == null || id != coffee.getId()) {
            log.info("잘못된 요청! id: {}, coffee: {}", id, coffee.toString());
        }

        target.patch(coffee);
        Coffee updated = coffeeRepository.save(target);

        return updated;
    }

    public Coffee delete(Long id) {
        Coffee target = coffeeRepository.findById(id).orElse(null);

        coffeeRepository.delete(target);

        if (target == null) return null;

        return target;
    }

}
