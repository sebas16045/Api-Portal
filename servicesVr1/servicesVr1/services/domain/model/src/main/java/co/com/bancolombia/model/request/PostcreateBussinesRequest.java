package co.com.bancolombia.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PostcreateBussinesRequest {
    private UUID id;
    private String name;
    private String description;
    private String image;
    private int hierarchy;
    private String owner;
    private String createby;
    private List<SpaceProduct> spaceProductList;
    private String username;
}
