package io.to.infrastructure.jpa;

import io.to.domain.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlMemberRepository  extends JpaRepository<Member, Long> {
}
