package com.demo.spring.boot.angular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.demo.spring.boot.angular.entity.Task;

/**
 * 
 * @author Kanhaiya.Sahu
 *
 */
@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
	List<Task> findByTaskStatus(@Param("status") String taskStatus);

}
