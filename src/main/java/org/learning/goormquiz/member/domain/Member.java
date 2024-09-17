package org.learning.goormquiz.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
    private Long memberId;
    private String name;
    private String email;
}
