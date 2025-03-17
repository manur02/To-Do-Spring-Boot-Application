package com.app.todoapp.Repositories;

import com.app.todoapp.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {



}
