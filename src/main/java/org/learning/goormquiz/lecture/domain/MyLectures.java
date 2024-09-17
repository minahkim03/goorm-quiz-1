package org.learning.goormquiz.lecture.domain;

import java.util.List;
import lombok.Getter;

@Getter
public class MyLectures {

    private final List<MyLecture> myLectures;

    public MyLectures(List<MyLecture> myLectures) {
        this.myLectures = myLectures;
    }
}
