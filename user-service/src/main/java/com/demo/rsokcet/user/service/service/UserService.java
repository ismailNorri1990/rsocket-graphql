package com.demo.rsokcet.user.service.service;

import com.demo.rsokcet.user.service.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface UserService {
    Mono<User> save(User user);
    Flux<User> findAll();
    Mono<User> findOne(long id);
    void delete(long id);
}
