package io.to.exposition;

import io.to.domain.entities.Member;

public class main {
    public static void main(String[] args) {
        Member member = Member.of("TO", "Nathaanel", "nto@myges.fr", "MYPWD", false);
        System.out.println(member);
    }
}
