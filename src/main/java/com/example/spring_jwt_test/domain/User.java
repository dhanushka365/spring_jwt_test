package com.example.spring_jwt_test.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;//primary_key{001,002,003,004...}
    private String userId;//EN91361
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date getLastLoginDateDisplay;
    private Date joinDate;
    private String[] roles;//ROLE_USER{read, edit}, ROLE_ADMIN{delete}
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;

}
