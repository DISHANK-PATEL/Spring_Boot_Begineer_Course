package com.example.todo.service;

import com.example.todo.request.AuthenticationRequest;
import com.example.todo.request.RegisterRequest;
import com.example.todo.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
