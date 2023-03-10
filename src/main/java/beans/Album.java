package beans;

import lombok.*;
import java.io.Serializable;
import java.time.Year;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {

    private int id;
    private String artist;
    private String name;
    private Year release_date;
    private double sales;
    private String genre;

}
