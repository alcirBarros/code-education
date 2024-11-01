package br.com.context.model;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Table(name = "rle_role", catalog = "role")
public class RoleEntity implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rle_id", nullable = false)
    private Integer id;

    @Column(name = "rle_descricao")
    private String descricao;

    @Override
    public String getAuthority() {
        return descricao;
    }
}
