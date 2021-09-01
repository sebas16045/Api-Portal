package co.com.bancolombia.apibusinessline;

import co.com.bancolombia.model.businessline.gateways.BusinessLineRepository;
import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;
import co.com.bancolombia.usecase.businessline.CheckBusinessLineUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity getlistall(@Validated @RequestBody GetlistallRequest request) {
        GetlistallResponse response;
        try {
            GetlistallResponse getlistallResponse = new GetlistallResponse();
            if (!(null == (request.getUsername())) && !request.getUsername().isEmpty()) {

                return ResponseEntity.ok(checkBusinessLineUseCase.getlistallResponse(request));
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



    @PostMapping(value = "/")
    public ResponseEntity createBussinesline(@RequestBody PostcreateBussinesRequest postcreateBussinesRequest ) {
        PostcreateBussinesResponse response;

        try {
            PostcreateBussinesResponse postcreateBussinesResponse = new PostcreateBussinesResponse();
            if (!(null == (postcreateBussinesRequest.getName())) && !postcreateBussinesRequest.getName().isEmpty())
                if (!(null == (postcreateBussinesRequest.getDescription())) && !postcreateBussinesRequest.getDescription().isEmpty())
                    if (!(null == (postcreateBussinesRequest.getImage())) && !postcreateBussinesRequest.getImage().isEmpty())
                        if (!(null == (postcreateBussinesRequest.getOwner())) && !postcreateBussinesRequest.getOwner().isEmpty())
                            if (!(null == (postcreateBussinesRequest.getCreateby())) && !postcreateBussinesRequest.getCreateby().isEmpty())

                    {

                return ResponseEntity.ok(checkBusinessLineUseCase.postcreateBussinesResponse(postcreateBussinesRequest));
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return null;
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity getBussinesLineById(@PathVariable("id") String id, @RequestBody GetBusinesslineByidRequest getBusinesslineByidRequest) throws IOException {
        try {
            GetBusinesslineByidResponse getBusinesslineByidResponse = new GetBusinesslineByidResponse();
            if (!(null == (getBusinesslineByidRequest.getUsername())) && !getBusinesslineByidRequest.getUsername().isEmpty()) {

                return ResponseEntity.ok(checkBusinessLineUseCase.selectGetBusinesslinebyId(id, getBusinesslineByidRequest));
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity putBussinesLineById(@PathVariable("id") String id, @RequestBody PostcreateBussinesRequest putUpdateBusinessLineByIdRequest) throws IOException {
        try {
            PutUpdateBusinessLineByIdResponse putUpdateBusinessLineByIdResponse = new PutUpdateBusinessLineByIdResponse();
            if (!(null == (putUpdateBusinessLineByIdRequest.getName())) && !putUpdateBusinessLineByIdRequest.getName().isEmpty())
                if (!(null == (putUpdateBusinessLineByIdRequest.getDescription())) && !putUpdateBusinessLineByIdRequest.getDescription().isEmpty())
                    if (!(null == (putUpdateBusinessLineByIdRequest.getImage())) && !putUpdateBusinessLineByIdRequest.getImage().isEmpty())
                        if (!(null == (putUpdateBusinessLineByIdRequest.getOwner())) && !putUpdateBusinessLineByIdRequest.getOwner().isEmpty())
                            if (!(null == (putUpdateBusinessLineByIdRequest.getCreateby())) && !putUpdateBusinessLineByIdRequest.getCreateby().isEmpty())

                            {

                                return ResponseEntity.ok(checkBusinessLineUseCase.putUpdateBusinessLineByIdResponse(id, putUpdateBusinessLineByIdRequest));
                            } else {
                                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

                            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return null;



    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity deleteBussinesLineById(@PathVariable("id") String id, @RequestBody DeleteBussinesLineByIdRequest deleteBussinesLineByIdRequest) throws IOException {
        try {
            DeleteBussinesLineByIdResponse deleteBussinesLineByIdResponse = new DeleteBussinesLineByIdResponse();
            if (!(null == (deleteBussinesLineByIdRequest.getUsername())) && !deleteBussinesLineByIdRequest.getUsername().isEmpty()) {

                return ResponseEntity.ok(checkBusinessLineUseCase.deleteBussinesLineByIdResponse(id, deleteBussinesLineByIdRequest));
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }



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
        try {
            DeleteCapacityByidResponse deleteCapacityByidResponse = new DeleteCapacityByidResponse();
            if (!(null == (deleteCapacityByidRequest.getUsername())) && !deleteCapacityByidRequest.getUsername().isEmpty()) {

                return ResponseEntity.ok(checkBusinessLineUseCase.deleteCapacityByidResponse(id, deleteCapacityByidRequest));
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }









    @PostMapping(value = "/createcommentary")
    public ResponseEntity createcommentary(@RequestBody PostCommentaryRequest postCommentaryRequest) {
        PostCommentaryResponse response;

        try {
            PostCommentaryResponse postCommentaryResponse = new PostCommentaryResponse();
            if (!(null == (postCommentaryRequest.getUsername())) && !postCommentaryRequest.getUsername().isEmpty())
                if (!(null == (postCommentaryRequest.getComment())) && !postCommentaryRequest.getComment().isEmpty())
                    {

                    return ResponseEntity.ok(checkBusinessLineUseCase.postCommentaryResponse(postCommentaryRequest));
                } else {
                    return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);

                }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return null;
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