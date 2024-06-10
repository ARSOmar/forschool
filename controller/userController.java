package com.example.demooo.controller;

import com.example.demooo.entity.User;
import com.example.demooo.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class userController {

    @Autowired
    private userServices userServices;

    // تابع لإضافة مستخدم جديد
    @PostMapping("/users/addUser")
    public @ResponseBody User addUser(@RequestBody User u) {
        return userServices.addUser(u); // يستخدم userServices لإضافة مستخدم جديد
    }

    // تابع للحصول على جميع المستخدمين
    @GetMapping("/users/getAll")
    public @ResponseBody ArrayList<User> getAll() {
        return userServices.getAll(); // يستخدم userServices للحصول على جميع المستخدمين
    }

    // تابع للبحث عن مستخدم بواسطة معرفه
    @GetMapping("/user/findUserId/{id}")
    public @ResponseBody Optional<User> findUserById(@PathVariable Long id) {
        return userServices.findUserById(id); // يستخدم userServices للبحث عن مستخدم باستخدام معرفه

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        Optional<User> userOptional = userServices.findUserById(id);
        if (userOptional.isPresent()) {
            userServices.deleteUserById(id);
            return ResponseEntity.ok().body("تم حذف المستخدم بنجاح.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}


