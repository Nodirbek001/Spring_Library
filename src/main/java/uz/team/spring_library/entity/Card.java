package uz.team.spring_library.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ColumnDefault("0")
    private Long balance;
    private String card = UUID.randomUUID().toString();
    @ColumnDefault("false")
    private boolean blocked;
    private Long userid;
}
