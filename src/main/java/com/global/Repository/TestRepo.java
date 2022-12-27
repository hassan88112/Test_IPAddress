package com.global.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.global.Entity.Test;

public interface TestRepo extends JpaRepository<Test, Long> {

}
