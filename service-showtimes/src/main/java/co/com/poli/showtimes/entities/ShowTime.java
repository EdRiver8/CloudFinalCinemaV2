package co.com.poli.showtimes.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Getter
@Setter
@Table(name = "showTimes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowTime {

    @Id
    @NotBlank(message = "the id field cannot be empty")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" ,unique = true,nullable = false)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowTime showTime = (ShowTime) o;
        return Objects.equals(id, showTime.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
