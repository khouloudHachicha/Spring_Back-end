package com.ProjetPFE.demo.Controller;

import com.ProjetPFE.demo.Dao.UserDao;
import com.ProjetPFE.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userDao.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userDao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User"));
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User user = userDao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User"));

        user.setUsername(userDetails.getUsername());
        user.setCin(userDetails.getCin());
        user.setEmail(userDetails.getEmail());
        user.setPhone(userDetails.getPhone());

        return userDao.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        User user = userDao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User"));

        userDao.delete(user);

        return ResponseEntity.ok().build();
    }
}
