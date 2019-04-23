package com.getsong.lml.server.repositories;

import com.getsong.lml.server.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Jpa repository for library
 *
 * @author getsong
 * @since 23/4/2019 9:29 PM
 */
public interface LibraryRepository extends JpaRepository<Library, Long> {
}
