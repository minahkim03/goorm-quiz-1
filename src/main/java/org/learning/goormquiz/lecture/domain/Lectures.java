package org.learning.goormquiz.lecture.domain;

import java.util.List;
import lombok.Getter;

@Getter
public class Lectures {

    private final List<Lecture> lectures;

    public Lectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }
}
