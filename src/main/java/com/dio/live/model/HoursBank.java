package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HoursBank {


    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class HoursBankId implements Serializable{
        private long hoursBankIdId;
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    private HoursBankId hoursBankId;
    private LocalDateTime workedDay;
    private BigDecimal hoursQuantity;
    private BigDecimal hoursBalance;

}
