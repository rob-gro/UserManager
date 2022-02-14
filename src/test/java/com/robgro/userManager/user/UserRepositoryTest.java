package com.robgro.userManager.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAddNew() {
        User user = new User();
        user.setFirstName("Jar");
        user.setLastName("Kac");
        user.setEmail("kac@gmail.com");
        user.setPassword("jaro123");

        User savedUser = userRepository.save(user);

        Assertions.assertNotNull(savedUser, "******************  User must be NOT NULL  ******************************");
    }

    @Test
    public void testListAll() {
        Iterable<User> users = userRepository.findAll();
        Assertions.assertNotNull(users);

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate() {
        Integer userId = 1;
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.get();
        user.setPassword("hello2000");
        userRepository.save(user);

        User updateUser = userRepository.findById(userId).get();
        Assertions.assertSame(updateUser, user, "hello2000");
    }

    @Test
    public void testGet() {
        Integer userId = 2;
        Optional<User> optionalUser2 = userRepository.findById(userId);
        Assertions.assertTrue(optionalUser2.isPresent());
        System.out.println(optionalUser2.get());
    }

    @Test
    public void testDelete() {
        Integer userId = 2;
        userRepository.deleteById(userId);

        Optional<User> optionalUser3 = userRepository.findById(userId);
        Assertions.assertTrue(optionalUser3.isEmpty());

    }
}