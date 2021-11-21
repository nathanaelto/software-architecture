package io.to.infrastructure.repository;

import io.to.domain.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlMemberRepository extends JpaRepository<Member, Long> {
}
