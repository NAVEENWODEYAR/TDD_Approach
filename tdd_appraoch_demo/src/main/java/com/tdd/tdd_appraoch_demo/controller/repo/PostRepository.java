package com.tdd.tdd_appraoch_demo.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tdd.tdd_appraoch_demo.dto.Post;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
