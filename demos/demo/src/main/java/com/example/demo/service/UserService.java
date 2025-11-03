package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read by ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Update
    public User updateUser(String id, User userDetails) {
        return userRepository.findById(id)
                .map(existing -> {
                    existing.setName(userDetails.getName());
                    existing.setEmail(userDetails.getEmail());
                    existing.setAge(userDetails.getAge());
                    return userRepository.save(existing);
                }).orElse(null);
    }

    // Delete
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
