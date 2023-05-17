    /*
    REST КОНТРОЛЛЕР ДЛЯ ТЕСТОВ ПОСТМАНА, БЕЗ РАБОТЫ С ГРАФИЧЕСКИМ ИНТЕРФЕЙСОМ
     */





//package com.example.trsoft.controllers;
//
//import com.example.trsoft.model.User;
//import com.example.trsoft.service.UserService;
//import jakarta.validation.constraints.NotNull;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/users")
//@RequiredArgsConstructor
//public class UserController {
//
//    private final UserService userService;
//
//
//    @PostMapping
//    public User create(@RequestBody User user) {
//        return userService.create(user);
//    }
//
//    @GetMapping("/{userId}")
//    public User findById(@NotNull @PathVariable Long userId) {
//        return userService.findById(userId);
//    }
//
//    @GetMapping
//    public List<User> getAll() {
//        return userService.getAll();
//    }
//
//    @PatchMapping("/{userId}")
//    public User update(@NotNull @PathVariable Long userId,
//                       @RequestBody User user) {
//        return userService.update(userId, user);
//    }
//
//    @DeleteMapping("/{userId}")
//    public void deleteById(@NotNull @PathVariable Long userId) {
//        userService.deleteById(userId);
//    }
//
//    @DeleteMapping
//    public void deleteAll() {
//        userService.deleteAll();
//    }
//}
