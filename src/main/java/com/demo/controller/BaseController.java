package com.demo.controller;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Base;
import com.demo.service.BaseService;
import com.demo.util.Dto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
//@RequestMapping("/base")
public class BaseController {

    private BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    
    @PostMapping("/updatejson")
    public Base updateJson(@RequestBody Dto dto) throws JsonParseException, JsonMappingException, IOException {    	
     Base base = baseService.updateBase(dto);
     return base;
    }
    
    @GetMapping("/getjsons")
    public Iterable<Base> list() {
        return baseService.list();
    }
    
    @GetMapping("/comparejsons")
    public ResponseEntity<byte[]> compareJson() throws JsonParseException, JsonMappingException, IOException {    	
     String json = baseService.compareJsons();
     byte[] isr = json.getBytes();
		String fileName = "diff.json";
		HttpHeaders respHeaders = new HttpHeaders();
		respHeaders.setContentLength(isr.length);
		respHeaders.setContentType(new MediaType("text", "json"));
		respHeaders.setCacheControl("must-revalidate, post-check=0, pre-check=0");
		respHeaders.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
		return new ResponseEntity<byte[]>(isr, respHeaders, HttpStatus.OK);
    }

}
