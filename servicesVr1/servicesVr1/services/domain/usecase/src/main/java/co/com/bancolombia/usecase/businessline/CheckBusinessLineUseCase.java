package co.com.bancolombia.usecase.businessline;

import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;

import java.io.IOException;
import java.util.ArrayList;
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
        postcreateBussinesResponse.setStatus("200");

        return postcreateBussinesResponse;
    }
    public GetBusinesslineByidResponse selectGetBusinesslinebyId(GetBusinesslineByidRequest request) throws IOException {
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
    public PutUpdateBusinessLineByIdResponse putUpdateBusinessLineByIdResponse(PutUpdateBusinessLineByIdRequest request) {

        PutUpdateBusinessLineByIdResponse putUpdateBusinessLineByIdResponse  = new PutUpdateBusinessLineByIdResponse();
        putUpdateBusinessLineByIdResponse.setStatus("200");

        return putUpdateBusinessLineByIdResponse;
    }
    public DeleteBussinesLineByIdResponse deleteBussinesLineByIdResponse(DeleteBussinesLineByIdRequest request) {

        DeleteBussinesLineByIdResponse deleteBussinesLineByIdResponse  = new DeleteBussinesLineByIdResponse();
        deleteBussinesLineByIdResponse.setStatus("200");

        return deleteBussinesLineByIdResponse;
    }
    public PostCapacityResponse postCapacityResponse(PostCapacityRequest request) {

        PostCapacityResponse postCapacityResponse  = new PostCapacityResponse();
        postCapacityResponse.setStatus("200");

        return postCapacityResponse;
    }
    public UpdateCapacityByidResponse updateCapacityByidResponse(UpdateCapacityByidRequest request) {

        UpdateCapacityByidResponse updateCapacityByidResponse  = new UpdateCapacityByidResponse();
        updateCapacityByidResponse.setStatus("200");

        return updateCapacityByidResponse;
    }
    public DeleteCapacityByidResponse deleteCapacityByidResponse(DeleteCapacityByidRequest request) {

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
    public GetQByidResponse getQByidResponse(GetQByidRequest request) {
        GetQByidResponse getQByidResponse = new GetQByidResponse();
        getQByidResponse.setNumber(0);
        getQByidResponse.setYear(0);
        return getQByidResponse;
    }
    public PutQByidResponse putQByidResponse(PutQByidRequest request) {

        PutQByidResponse putQByidResponse  = new PutQByidResponse();
        putQByidResponse.setStatus("200");

        return putQByidResponse;
    }
    public DeleteQByidResponse deleteQByidResponse(DeleteQByidRequest request) {

        DeleteQByidResponse deleteQByidResponse  = new DeleteQByidResponse();
        deleteQByidResponse.setStatus("200");

        return deleteQByidResponse;
    }
    public PostSprintResponse postSprintResponse(PostSprintRequest request) {

        PostSprintResponse postSprintResponse  = new PostSprintResponse();
        postSprintResponse.setStatus("200");

        return postSprintResponse;
    }

    public GetSprintByidResponse getSprintByidResponse(GetSprintByidRequest request) {
        GetSprintByidResponse getSprintByidResponse = new GetSprintByidResponse();
        getSprintByidResponse.setNumber(0);
        getSprintByidResponse.setInitialdate(0);
        getSprintByidResponse.setFinaldate(0);
        return getSprintByidResponse;
    }
    public PutSprintByidResponse putSprintByidResponse(PutSprintByidRequest request) {

        PutSprintByidResponse putSprintByidResponse  = new PutSprintByidResponse();
        putSprintByidResponse.setStatus("200");

        return putSprintByidResponse;
    }
    public DeleteSprintByidResponse deleteSprintByidResponse(DeleteSprintByidRequest request) {

        DeleteSprintByidResponse deleteSprintByidResponse  = new DeleteSprintByidResponse();
        deleteSprintByidResponse.setStatus("200");

        return deleteSprintByidResponse;
    }
}

