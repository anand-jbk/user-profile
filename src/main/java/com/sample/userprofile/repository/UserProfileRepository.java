package com.sample.userprofile.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sample.userprofile.entity.UserProfile;

@Repository
public class UserProfileRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileRepository.class);

    public UserProfile getUSerProfile(final String id) {
        LOGGER.info("Entry getUserProfile");
        return new UserProfile(id, id);
    }
}
