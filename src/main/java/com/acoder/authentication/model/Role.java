package com.acoder.authentication.model;

import com.acoder.authentication.model.Enum.RoleName;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
}
