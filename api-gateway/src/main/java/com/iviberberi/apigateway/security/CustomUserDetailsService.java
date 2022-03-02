package com.iviberberi.apigateway.security;

import com.iviberberi.apigateway.model.User;
import com.iviberberi.apigateway.service.UserService;
import com.iviberberi.apigateway.util.SecurityUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username : " + username));

        //authorities
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));


        //UserDetails
        return UserPrincipal.builder()
                .user(user)
                .id(user.getUserId())
                .username(username)
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
