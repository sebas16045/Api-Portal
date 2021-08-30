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
public class Capabilities {
    private UUID id;
    private String name;
    private List<Sprint> sprintList;
    private List<Q> qList;
    private String urlapi;
    private String description;
    private String productorteam;
    private String functionalleader;
    private String status;
    private String createby;
}
