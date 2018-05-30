package com.ywt.eureka_client.dao;

import com.ywt.eureka_client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserDao extends JpaRepository<User, Long> {
    @Override
    <S extends User> S saveAndFlush(S entity);
}
