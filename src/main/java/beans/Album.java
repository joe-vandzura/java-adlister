package beans;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private int release_date;
    private double sales;
    private String genre;
}
