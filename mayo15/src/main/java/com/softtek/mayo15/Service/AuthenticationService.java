package com.softtek.mayo15.Service;


import com.softtek.mayo15.dao.request.SignInRequest;
import com.softtek.mayo15.dao.request.SignUpRequest;
import com.softtek.mayo15.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}
