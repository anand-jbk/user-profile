package com.sample.userprofile.repository;

import org.springframework.stereotype.Repository;

import com.sample.userprofile.entity.UserProfile;

@Repository
public class UserProfileRepository {

    public UserProfile getUSerProfile(final String id) {
        return new UserProfile(id, id);
    }
}
