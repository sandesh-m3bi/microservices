package com.demo.mmmbi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mmmbi.service.VehicleInsuranceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("api/v1")
@Api(value="Vehicle Insurance", description="Operations pertaining to vehicle insurance")
public class VehicleInsuranceController {
	
	private VehicleInsuranceService vehicleInsuranceService;

	@RequestMapping(value = "/quotations", method= RequestMethod.GET)
	@ApiOperation(value = "View a list of available quotations", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
    public Iterable listQuotations(Model model){
        Iterable productList = vehicleInsuranceService.listAllQuotations();
        return productList;
    }
	
	
	@RequestMapping(value = "/policies", method= RequestMethod.GET)
	@ApiOperation(value = "View a list of available policies", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
    public Iterable listPolicies(Model model){
        Iterable productList = vehicleInsuranceService.listAllPolicies();
        return productList;
    }
	
}
