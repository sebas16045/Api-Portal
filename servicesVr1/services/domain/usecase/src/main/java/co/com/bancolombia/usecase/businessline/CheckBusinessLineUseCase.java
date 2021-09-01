package co.com.bancolombia.usecase.businessline;

import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


public class CheckBusinessLineUseCase {


    //private final BusinessLineRepository businessLineRepository;

    public GetlistallResponse getlistallResponse(GetlistallRequest request) {

        GetlistallResponse getlistallResponse = new GetlistallResponse();
        getlistallResponse.setId(UUID.randomUUID());
        getlistallResponse.setName("");
        getlistallResponse.setDescription("");
        getlistallResponse.setImage("");
        getlistallResponse.setHierarchy(0);
        getlistallResponse.setOwner("");
        getlistallResponse.setCreateby("");

        return getlistallResponse;

    }
     public PostcreateBussinesResponse postcreateBussinesResponse(PostcreateBussinesRequest request) {

       PostcreateBussinesResponse postcreateBussinesResponse  = new PostcreateBussinesResponse();

        return postcreateBussinesResponse;
    }
    public GetBusinesslineByidResponse selectGetBusinesslinebyId(String id, GetBusinesslineByidRequest request) throws IOException {
        GetBusinesslineByidResponse response = new GetBusinesslineByidResponse();
        response.setId(UUID.randomUUID());
        response.setName("");
        response.setDescription("");
        response.setImage("");
        response.setHierarchy(0);
        response.setOwner("");
        response.setCreateby("");
        response.setCapabilitiesList(new ArrayList<Capabilities>());
        Capabilities capabilities = new Capabilities();
        capabilities.setId(UUID.randomUUID());
        capabilities.setName("");
        response.getCapabilitiesList().add(capabilities);


        Sprint sprint = new Sprint();
        capabilities.setSprintList(new ArrayList<Sprint>());
        sprint.setId(UUID.randomUUID());
        sprint.setNumber(0);
        sprint.setInitialdate(2021);
        sprint.setFinaldate(2022);
        capabilities.getSprintList().add(sprint);


        Q q= new Q();
        capabilities.setQList(new ArrayList<Q>());
        q.setId(UUID.randomUUID());
        q.setNumber(0);
        q.setYear(0);
        capabilities.getQList().add(q);

        capabilities.setUrlapi("");
        capabilities.setDescription("");
        capabilities.setProductorteam("");
        capabilities.setFunctionalleader("");
        capabilities.setStatus("");
        capabilities.setCreateby("");

        response.setSpacesList(new ArrayList<Spaces>());
        Spaces spaces = new Spaces();
        spaces.setId(UUID.randomUUID());
        spaces.setName("");
        response.getSpacesList().add(spaces);

        spaces.setProductsList(new ArrayList<Products>());
        Products products = new Products();
        products.setId(UUID.randomUUID());
        products.setName("");
        products.setProducttype("");
        products.setApiversion("");
        products.setProductversion("");
        products.setDescription("");
        spaces.getProductsList().add(products);

        return response;
    }
    public PutUpdateBusinessLineByIdResponse putUpdateBusinessLineByIdResponse(String id, PostcreateBussinesRequest request) throws IOException {


        PutUpdateBusinessLineByIdResponse putUpdateBusinessLineByIdResponse  = new PutUpdateBusinessLineByIdResponse();

        return putUpdateBusinessLineByIdResponse;
    }
    public DeleteBussinesLineByIdResponse deleteBussinesLineByIdResponse(String id, DeleteBussinesLineByIdRequest request) throws IOException {

        DeleteBussinesLineByIdResponse deleteBussinesLineByIdResponse  = new DeleteBussinesLineByIdResponse();

        return deleteBussinesLineByIdResponse;
    }
    public PostCapacityResponse postCapacityResponse(PostCapacityRequest request) {

        PostCapacityResponse postCapacityResponse  = new PostCapacityResponse();
        postCapacityResponse.setStatus("200");

        return postCapacityResponse;
    }
    public UpdateCapacityByidResponse updateCapacityByidResponse(String id,UpdateCapacityByidRequest request) throws IOException {

        UpdateCapacityByidResponse updateCapacityByidResponse  = new UpdateCapacityByidResponse();
        updateCapacityByidResponse.setStatus("200");

        return updateCapacityByidResponse;
    }
    public DeleteCapacityByidResponse deleteCapacityByidResponse(String id,DeleteCapacityByidRequest request) throws IOException {

        DeleteCapacityByidResponse deleteCapacityByidResponse  = new DeleteCapacityByidResponse();
        deleteCapacityByidResponse.setStatus("200");

        return deleteCapacityByidResponse;
    }

    public PostCommentaryResponse postCommentaryResponse(PostCommentaryRequest request) {

        PostCommentaryResponse postCommentaryResponse  = new PostCommentaryResponse();
        postCommentaryResponse.setStatus("200");

        return postCommentaryResponse;
    }

    public PostQResponse postQResponse(PostQRequest request) {

        PostQResponse postQResponse  = new PostQResponse();
        postQResponse.setStatus("200");

        return postQResponse;
    }
    public GetQByIdResponse getQByIdResponse(String id,GetQByIdRequest request) throws IOException {

        GetQByIdResponse getQByIdResponse  = new GetQByIdResponse();
        getQByIdResponse.setNumber(0);
        getQByIdResponse.setYear(0);

        return getQByIdResponse;
    }
    public PutQByIdResponse putQByIdResponse(String id,PutQByIdRequest request) throws IOException {

        PutQByIdResponse putQByIdResponse  = new PutQByIdResponse();
        putQByIdResponse.setStatus("200");

        return putQByIdResponse;
    }
    public DeleteQByIdResponse deleteQByIdResponse(String id,DeleteQByIdRequest request) throws IOException {

        DeleteQByIdResponse deleteQByIdResponse  = new DeleteQByIdResponse();
        deleteQByIdResponse.setStatus("200");

        return deleteQByIdResponse;
    }
    public PostSprintResponse postSprintResponse(PostSprintRequest request) {

        PostSprintResponse postSprintResponse  = new PostSprintResponse();
        postSprintResponse.setStatus("200");

        return postSprintResponse;
    }
    public GetSprintByIdResponse getSprintByIdResponse(String id,GetSprintByIdRequest request) throws IOException {

        GetSprintByIdResponse getSprintByIdResponse  = new GetSprintByIdResponse();
        getSprintByIdResponse.setNumber(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date initialdate=new Date();
        Date finaldate=new Date();
        System.out.println(sdf.format(initialdate));
        System.out.println(sdf.format(finaldate));
        getSprintByIdResponse.setInitialdate(initialdate);
        getSprintByIdResponse.setFinaldate(finaldate);

        return getSprintByIdResponse;
    }
    public PutSprintByIdResponse putSprintByIdResponse(String id,PutSprintByIdRequest request) throws IOException {

        PutSprintByIdResponse putSprintByIdResponse  = new PutSprintByIdResponse();
        putSprintByIdResponse.setStatus("200");

        return putSprintByIdResponse;
    }
    public DeleteSprintByIdResponse deleteSprintByIdResponse(String id,DeleteSprintByIdRequest request) throws IOException {

        DeleteSprintByIdResponse deleteSprintByIdResponse  = new DeleteSprintByIdResponse();
        deleteSprintByIdResponse.setStatus("200");

        return deleteSprintByIdResponse;
    }

}

