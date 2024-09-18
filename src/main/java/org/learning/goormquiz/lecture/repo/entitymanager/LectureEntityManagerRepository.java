package org.learning.goormquiz.lecture.repo.entitymanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class LectureEntityManagerRepository {

    @PersistenceContext
    private EntityManager em;

    /**
     * TODO
     * EntityManager를 이용해 db 조회
     */
}
