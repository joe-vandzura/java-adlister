package beans;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Author implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
}
