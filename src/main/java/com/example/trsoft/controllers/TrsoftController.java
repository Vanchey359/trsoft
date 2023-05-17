package com.example.trsoft.controllers;

import com.example.trsoft.model.User;
import com.example.trsoft.service.UserService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
КОНТРОЛЛЕР ДЛЯ РАБОТЫ С ГРАФИЧЕСКИМ ИНТЕРФЕЙСОМ.
 */

@Controller
@RequiredArgsConstructor
public class TrsoftController {

    private final UserService userService;

    @GetMapping("/")
    public String page(@RequestParam(name = "email", required = false) String email, Model model) {
        model.addAttribute("users", userService.findByMailOrAll(email));
        return "trsoft";
    }

    @GetMapping("/users/{userId}")
    public String userInfo(@NotNull @PathVariable Long userId, Model model) {
        model.addAttribute("user", userService.findById(userId));
        return "user-info";
    }

    @PostMapping("/users/create")
    public String createUser(User user) {
        userService.create(user);
        return "redirect:/";
    }

    @PostMapping("/users/delete/{userId}")
    public String deleteUser(@NotNull @PathVariable Long userId) {
        userService.deleteById(userId);
        return "redirect:/";
    }
}
