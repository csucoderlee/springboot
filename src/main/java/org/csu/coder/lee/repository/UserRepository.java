package org.csu.coder.lee.repository;

import org.csu.coder.lee.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by csucoderlee on 2017 04 05 下午10:54.
 */

public interface UserRepository extends JpaRepository<User, Integer> {
}
