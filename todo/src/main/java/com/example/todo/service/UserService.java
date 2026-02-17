package service;

import com.example.todo.request.PasswordUpdateRequest;
import com.example.todo.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();
    void deleteUser();
    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
