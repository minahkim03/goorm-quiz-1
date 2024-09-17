package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class Price {

    private int price;

    public Price(int price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }
}
