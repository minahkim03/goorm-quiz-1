package org.learning.goormquiz.lecture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.learning.goormquiz.member.domain.Member;

@Getter
@AllArgsConstructor
public class MyLecture {

    private Long id;
    private Member member;
    private Lecture lecture;
}
