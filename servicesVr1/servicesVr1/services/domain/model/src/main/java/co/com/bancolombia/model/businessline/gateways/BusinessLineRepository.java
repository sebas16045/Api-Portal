package co.com.bancolombia.model.businessline.gateways;

import co.com.bancolombia.model.response.ApiResponse;

public interface BusinessLineRepository {
    ApiResponse selectBD(String username);

}
