package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class PriceEntity {

    private int price;

    public PriceEntity(int price) {
        this.price = price;
    }
}
