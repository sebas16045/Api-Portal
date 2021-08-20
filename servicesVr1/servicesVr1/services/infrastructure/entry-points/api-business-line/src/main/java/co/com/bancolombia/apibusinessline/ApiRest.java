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
    @PostMapping(value = "/createcapacity")
    public ResponseEntity createcapacity(PostCapacityRequest request) {
        PostcreateBussinesResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postCapacityResponse(request));

    }
    @PutMapping(value = "/updatecapacity")
    public ResponseEntity updatecapacity(UpdateCapacityByidRequest request) {
        UpdateCapacityByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.updateCapacityByidResponse(request));

    }
    @DeleteMapping(value = "/deletecapacity")
    public ResponseEntity deletecapacity(DeleteCapacityByidRequest request) {
        DeleteCapacityByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteCapacityByidResponse(request));

    }
    @PostMapping(value = "/createcommentary")
    public ResponseEntity createcommentary(PostCommentaryRequest request) {
        PostCommentaryResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postCommentaryResponse(request));

    }

    @PostMapping(value = "/createQ")
    public ResponseEntity createq(PostQRequest request) {
        PostQResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postQResponse(request));

    }

    @GetMapping(value = "/getQ")
    public ResponseEntity getq(GetQByidRequest request) {
        GetQByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.getQByidResponse(request));

    }
    @PutMapping(value = "/updateQ")
    public ResponseEntity updateq(PutQByidRequest request) {
        PutQByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.putQByidResponse(request));

    }

    @DeleteMapping(value = "/deleteQ")
    public ResponseEntity deleteq(DeleteQByidRequest request) {
        DeleteQByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteQByidResponse(request));

    }
    @PostMapping(value = "/createSprint")
    public ResponseEntity createsprint(PostSprintRequest request) {
        PostSprintResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postSprintResponse(request));

    }
    @PutMapping(value = "/getSprint")
    public ResponseEntity getsprint(GetSprintByidRequest request) {
        GetSprintByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.getSprintByidResponse(request));

    }

    @PutMapping(value = "/updateSprint")
    public ResponseEntity updateq(PutSprintByidRequest request) {
        PutSprintByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.putSprintByidResponse(request));

    }

    @DeleteMapping(value = "/deleteSprint")
    public ResponseEntity deletesprint(DeleteSprintByidRequest request) {
        DeleteSprintByidResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteSprintByidResponse(request));

    }















}