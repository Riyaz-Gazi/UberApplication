package com.uber.service.impl;

import com.uber.dto.DriverDto;
import com.uber.dto.SignupDto;
import com.uber.dto.UserDto;
import com.uber.entity.Rider;
import com.uber.entity.User;
import com.uber.entity.enums.Role;
import com.uber.exception.RuntimeConflictException;
import com.uber.repository.UserRepository;
import com.uber.service.AuthService;
import com.uber.service.RiderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    @Transactional
    public UserDto signup(SignupDto signupDto) {

        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if (user != null) {
            throw new RuntimeConflictException("Cannot signup , User already exist with email " + signupDto.getEmail());
        }

        User newUser = modelMapper.map(signupDto, User.class);
        newUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(newUser);

        // create user related entity
        Rider rider = riderService.createNewRider(savedUser);

        // TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
