package co.com.bancolombia.connectbd;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.model.response.ApiResponse;
import co.com.bancolombia.model.response.Result;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ConexionExterna implements BusinessLineRepository {


    public ApiResponse selectBD(String username){
        Result result=Result.builder()
                .id(UUID.randomUUID())
                .name("")
                .description("")
                .image("")
                .hierarchy(Integer.parseInt(""))
                .owner("")
                .createby("")
                .build();
        List<Result> listResult=new ArrayList<>();
        listResult.add(result);
        ApiResponse response=ApiResponse.builder()
                .total_results(1)
                .results(listResult)
                .build();

        return response;
    }
}
