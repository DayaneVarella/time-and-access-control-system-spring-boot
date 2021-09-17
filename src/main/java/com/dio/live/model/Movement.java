package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class MovementId implements Serializable{
            private long movementIdId;
            private long userId;
        }

        @Id
        @EmbeddedId
        private MovementId movementId;
        private LocalDateTime entryDate;
        private LocalDateTime exitDate;
        private BigDecimal period;
        @ManyToOne
        private Occurrence occurrence;
        @ManyToOne
        private Calendar calendar;
}
