package co.com.bancolombia.usecase.businessline;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.model.response.ApiResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BusinesslineUseCase {

    private final BusinessLineRepository businessLineRepository;

    public ApiResponse selectBusinessLine(String username) {
        ApiResponse response = businessLineRepository.selectBD(username);
        return response;
    }
}
