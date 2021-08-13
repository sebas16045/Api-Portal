package co.com.bancolombia.usecase.businessline;

import co.com.bancolombia.model.request.*;
import co.com.bancolombia.model.response.*;
import co.com.bancolombia.model.response.Spaces;

import java.io.IOException;
import java.net.URL;
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



}

