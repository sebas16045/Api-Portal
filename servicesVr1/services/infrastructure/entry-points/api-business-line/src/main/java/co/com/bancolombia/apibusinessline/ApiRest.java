package co.com.bancolombia.apibusinessline;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;
import co.com.bancolombia.usecase.businessline.CheckBusinessLineUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;

@RestController
@RequestMapping(value = "/portal/businessline")
@RequiredArgsConstructor
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
@ControllerAdvice
@ResponseBody
public class ApiRest {
    private final BusinessLineRepository businessLineRepository;

    private final CheckBusinessLineUseCase checkBusinessLineUseCase;


    @GetMapping(value = "/")
    public ResponseEntity getlistall(@RequestBody GetlistallRequest request) {
        GetlistallResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.getlistallResponse(request));
    }

    @PostMapping(value = "/")
    public ResponseEntity createBussinesline(PostcreateBussinesRequest request) {
        PostcreateBussinesResponse response;
        try {
            if (!validateInpuntPostBusinessLine(request)) {
                //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Expectation Failed from Client (CODE 400)\n");
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
            }
            return new ResponseEntity(HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    private boolean validateInpuntPostBusinessLine(PostcreateBussinesRequest request) {
        if (true)
            return true;
        else
            return false;


    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity getBussinesLineById(@PathVariable("id") String id, @RequestBody GetBusinesslineByidRequest getBusinesslineByidRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.selectGetBusinesslinebyId(id, getBusinesslineByidRequest));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity putBussinesLineById(@PathVariable("id") String id, @RequestBody PostcreateBussinesRequest putUpdateBusinessLineByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.putUpdateBusinessLineByIdResponse(id, putUpdateBusinessLineByIdRequest));

    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity deleteBussinesLineById(@PathVariable("id") String id, @RequestBody DeleteBussinesLineByIdRequest deleteBussinesLineByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteBussinesLineByIdResponse(id, deleteBussinesLineByIdRequest));

    }







    @PostMapping(value = "/capacity")
    public ResponseEntity createcapacity(PostCapacityRequest request) {
        PostcreateBussinesResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postCapacityResponse(request));

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/capacity/{id}")
    public ResponseEntity updatecapacity(@PathVariable("id") String id, @RequestBody UpdateCapacityByidRequest updateCapacityByidRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.updateCapacityByidResponse(id, updateCapacityByidRequest));

    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/capacity/{id}")
    public ResponseEntity deletecapacity(@PathVariable("id") String id, @RequestBody DeleteCapacityByidRequest deleteCapacityByidRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteCapacityByidResponse(id, deleteCapacityByidRequest));

    }









    @PostMapping(value = "/createcommentary")
    public ResponseEntity createcommentary(PostCommentaryRequest request) {
        PostCommentaryResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postCommentaryResponse(request));

    }







    @PostMapping(value = "/q")
    public ResponseEntity createq(PostQRequest request) {
        PostQResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postQResponse(request));

    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/q/{id}")
    public ResponseEntity getQById(@PathVariable("id") String id, @RequestBody GetQByIdRequest getQByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.getQByIdResponse(id, getQByIdRequest));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/q/{id}")
    public ResponseEntity putQById(@PathVariable("id") String id, @RequestBody PutQByIdRequest putQByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.putQByIdResponse(id, putQByIdRequest));
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/q/{id}")
    public ResponseEntity deleteQById(@PathVariable("id") String id, @RequestBody DeleteQByIdRequest deleteQByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteQByIdResponse(id, deleteQByIdRequest));
    }









    @PostMapping(value = "/sprint")
    public ResponseEntity createsprint(PostSprintRequest request) {
        PostSprintResponse response;
        return ResponseEntity.ok(checkBusinessLineUseCase.postSprintResponse(request));

    }
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/sprint/{id}")
    public ResponseEntity getSprintById(@PathVariable("id") String id, @RequestBody GetSprintByIdRequest getSprintByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.getSprintByIdResponse(id, getSprintByIdRequest));
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/sprint/{id}")
    public ResponseEntity putSprintById(@PathVariable("id") String id, @RequestBody PutSprintByIdRequest putSprintByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.putSprintByIdResponse(id, putSprintByIdRequest));
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/sprint/{id}")
    public ResponseEntity deleteSprintById(@PathVariable("id") String id, @RequestBody DeleteSprintByIdRequest deleteSprintByIdRequest) throws IOException {
        return ResponseEntity.ok(checkBusinessLineUseCase.deleteSprintByIdResponse(id, deleteSprintByIdRequest));
    }


}