package com.example.todo.service;

import com.example.todo.request.TodoRequest;
import com.example.todo.response.TodoResponse;

import java.util.List;

public interface TodoService {
    List<TodoResponse> getAllTodos();
    TodoResponse createTodo(TodoRequest todoRequest);
    TodoResponse toggleTodoCompletion(long id);
    void deleteTodo(long id);
}
