package com.example.demooo.repository;

import com.example.demooo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

    // استعلام يُستخدم لتسجيل الدخول باستخدام البريد الإلكتروني وكلمة المرور
    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    Optional<User> loginAccount(@Param("email") String email, @Param("password") String password);

    // استعلام يُستخدم للبحث عن مستخدم باستخدام البريد الإلكتروني وكلمة المرور
    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    Optional<User> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
