package com.example.demooo.services;

import com.example.demooo.entity.User;
import com.example.demooo.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class userServices {

    // حقل يتم حقنه بواسطة Spring ليتمكن من استخدام repository
    @Autowired
    private userRepository userRepository;

    // تابع لإضافة مستخدم جديد
    public User addUser(User u) {
        return userRepository.save(u); // يستخدم الـ userRepository لحفظ المستخدم الجديد
    }

    // تابع للحصول على جميع المستخدمين
    public ArrayList<User> getAll() {
        return (ArrayList<User>) userRepository.findAll(); // يستخدم الـ userRepository للعثور على جميع المستخدمين
    }

    // تابع للبحث عن مستخدم بواسطة معرفه
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id); // يستخدم الـ userRepository للبحث عن مستخدم باستخدام معرفه
    }
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
