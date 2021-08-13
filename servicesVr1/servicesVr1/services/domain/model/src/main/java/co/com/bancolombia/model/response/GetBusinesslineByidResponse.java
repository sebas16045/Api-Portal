package co.com.bancolombia.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBusinesslineByidResponse {
    private UUID id;
    private String name;
    private String description;
    private String image;
    private int hierarchy;
    private String owner;
    private String createby;
    private List<Capabilities> capabilitiesList;
    private List<Spaces> spacesList;


}
