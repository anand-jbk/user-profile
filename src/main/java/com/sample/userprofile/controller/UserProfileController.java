package com.sample.userprofile.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.userprofile.entity.UserProfile;
import com.sample.userprofile.repository.UserProfileRepository;

@RestController
public class UserProfileController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileController.class);

    @Autowired
    private UserProfileRepository userProfileRepository;

    @GetMapping("userprofile/{id}")
    public UserProfile getUserProfile(@PathVariable final String id) {
        LOGGER.info("Entry getUserProfile");
        final UserProfile userProfile = userProfileRepository.getUSerProfile(id);
        return userProfile;
    }
}
