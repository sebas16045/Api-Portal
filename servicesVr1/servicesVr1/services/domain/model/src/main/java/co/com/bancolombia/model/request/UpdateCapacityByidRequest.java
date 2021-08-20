package co.com.bancolombia.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UpdateCapacityByidRequest {
    private UUID id;
    private List<PostCapacityRequest> postCapacityRequestList;
}
