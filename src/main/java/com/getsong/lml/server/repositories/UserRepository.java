package com.getsong.lml.server.repositories;

import com.getsong.lml.server.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for User
 *
 * @author getsong
 * @since 21/4/2019 5:46 PM
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByNationalId(String nationalId);

}
