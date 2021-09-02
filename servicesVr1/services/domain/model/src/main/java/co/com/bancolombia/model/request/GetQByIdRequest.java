package co.com.bancolombia.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GetQByIdRequest {
    private UUID id;
    private String username;

}
