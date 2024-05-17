package com.softtek.mayo15.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface Userservice {
    UserDetailsService userDetailsService();
}