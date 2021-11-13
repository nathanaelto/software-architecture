package io.to;

import io.to.domain.Member;

public class main {
    public static void main(String[] args) {
        Member member = Member.of("TO", "Nathaanel", "nto@myges.fr", "MYPWD");
        System.out.println(member);
    }
}
