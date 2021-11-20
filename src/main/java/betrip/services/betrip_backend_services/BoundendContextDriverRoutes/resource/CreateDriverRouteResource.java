package betrip.services.betrip_backend_services.BoundendContextDriverRoutes.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateDriverRouteResource {

    @NotNull
    private  Long driverId;
    @NotNull
    @NotBlank
    private String destiny;
    @NotNull
    private  Long seating;
    @NotNull
    @NotBlank
    private String starting_point;
    @NotNull
    @NotBlank
    private String departure_time;
    @NotNull
    @NotBlank
    private String departure_date;
    @NotNull
    private  Long cost;

}
