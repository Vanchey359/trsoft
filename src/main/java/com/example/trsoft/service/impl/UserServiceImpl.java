package com.example.trsoft.service.impl;

import com.example.trsoft.exception.ObjectNotFoundException;
import com.example.trsoft.model.User;
import com.example.trsoft.repository.UserRepository;
import com.example.trsoft.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional
    @Override
    public User create(User user) {
        log.info("creating user with email {}", user.getEmail());
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(long userId) {
        log.info("start find user by id {}", userId);
        return userRepository.findById(userId)
                .orElseThrow(() -> new ObjectNotFoundException("user with id: " + userId + " not found error"));
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findByMailOrAll(String email) {
        if (email != null) return userRepository.findByEmail(email);
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        log.info("start find all users");
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User update(long userId, User user) {
        log.info("start updating user with id {}", userId);
        User updateUser = userRepository.findById(userId)
                .orElseThrow(() -> new ObjectNotFoundException("user with id: " + userId + " not found error"));

        if (user.getLastName() != null) {
            updateUser.setLastName(user.getLastName());
        }

        if (user.getName() != null) {
            updateUser.setName(user.getName());
        }

        if (user.getSurname() != null) {
            updateUser.setSurname(user.getSurname());
        }

        if (user.getDateOfBirthday() != null) {
            updateUser.setDateOfBirthday(user.getDateOfBirthday());
        }

        if (user.getEmail() != null) {
            updateUser.setEmail(user.getEmail());
        }

        if (user.getPhoneNumber() != null) {
            updateUser.setPhoneNumber(user.getPhoneNumber());
        }

        log.info("user with id {} was updated", userId);

        return updateUser;
    }

    @Transactional
    @Override
    public void deleteById(long userId) {
        userRepository.findById(userId)
                        .orElseThrow(() -> new ObjectNotFoundException("user with id: " + userId + " not found error"));

        userRepository.deleteById(userId);
        log.info("user with id {} was deleted", userId);
    }

    @Transactional
    @Override
    public void deleteAll() {
        userRepository.deleteAll();
        log.info("all users deleted");
    }
}
