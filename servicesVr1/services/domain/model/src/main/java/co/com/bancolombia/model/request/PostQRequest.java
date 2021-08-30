package co.com.bancolombia.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PostQRequest {
    private int number;
    private int year;
    private List<User>userList;

}
