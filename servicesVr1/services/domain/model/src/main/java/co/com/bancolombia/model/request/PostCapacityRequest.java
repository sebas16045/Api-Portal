package co.com.bancolombia.model.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PostCapacityRequest {
    private String name;
    private UUID sprintid;
    private UUID qid;
    private String urlapi;
    private String description;
    private String productorteam;
    private String functionalleader;
    private String status;
    private String createdby;
    private List<User> userList;
}
