package co.com.bancolombia.model.request;

import co.com.bancolombia.model.response.GetlistallResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PutUpdateBusinessLineByIdRequest {
    private UUID id;
    private List<GetlistallResponse>getlistallResponseList;
    private List<SpaceProduct>spaceProductList;
    private List<User>userList;

}
