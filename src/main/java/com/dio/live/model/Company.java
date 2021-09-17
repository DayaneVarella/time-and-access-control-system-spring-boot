package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Company {
    @Id
    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String phoneNumber;
}
