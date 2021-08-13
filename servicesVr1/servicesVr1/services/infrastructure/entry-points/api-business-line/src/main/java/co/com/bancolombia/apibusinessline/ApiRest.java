package co.com.bancolombia.apibusinessline;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;
import co.com.bancolombia.usecase.businessline.CheckBusinessLineUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/portal/businessline")
@RequiredArgsConstructor
public class ApiRest {
    private final BusinessLineRepository businessLineRepository;

    private final CheckBusinessLineUseCase checkBusinessLineUseCase;

    @GetMapping(value = "/getlistallk")
    public ResponseEntity getListAllk(@RequestBody ApiRequest request) {
        ApiResponse response;
        if (request.getUsername() != null) {
            response = businessLineRepository.selectBD(request.getUsername());
            return ResponseEntity.ok().body(response);
        } else {
            return ResponseEntity.ok().body("ERROR");
        }
    }
    @GetMapping(value = "/getlistall")
    public ResponseEntity getlistall(@RequestBody GetlistallRequest request) {
        GetlistallResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.getlistallResponse(request));
    }
    @PostMapping(value = "/createbussinesline")
    public ResponseEntity createBussinesline(PostcreateBussinesRequest request) {
        PostcreateBussinesResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postcreateBussinesResponse(request));

    }

    @GetMapping(value = "/getbussineslinebyid")
    public ResponseEntity getBussinesLineById(@RequestBody GetBusinesslineByidRequest request) throws IOException {
        GetBusinesslineByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.selectGetBusinesslinebyId(request));
    }

    @PutMapping(value = "/updatebusinessline")
    public ResponseEntity updatebusinessline(PutUpdateBusinessLineByIdRequest request) {
        PutUpdateBusinessLineByIdResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.putUpdateBusinessLineByIdResponse(request));

    }
    @DeleteMapping(value = "/deletebusinessline")
    public ResponseEntity deletebusinessline(DeleteBussinesLineByIdRequest request) {
        DeleteBussinesLineByIdResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteBussinesLineByIdResponse(request));

    }














}