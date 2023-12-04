package com.spring.springdatajpa2023.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        )
        ,
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_mobile")
        )


})
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}
