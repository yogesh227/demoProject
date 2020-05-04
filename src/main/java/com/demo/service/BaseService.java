package com.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.domain.Base;
import com.demo.repository.BaseRepository;
import com.demo.util.Dto;
import com.demo.util.FlatMapUtil;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

@Service
public class BaseService {

    private BaseRepository baseRepository;

    public BaseService(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
    public Base updateBase(Dto dto) throws JsonParseException, JsonMappingException, IOException {
    	ObjectMapper mapper = new ObjectMapper();
    	Optional<Base> baseOptional = baseRepository.findById(dto.getId());
    	TypeReference<Base> typeReference1 = new TypeReference<Base>(){};
		InputStream inputStream1 = TypeReference.class.getResourceAsStream(dto.getJsonPath());
		Base base = mapper.readValue(inputStream1,typeReference1);		
    	if(baseOptional.isPresent()) {
    		baseOptional.get().setContent(base.getContent());
    		baseOptional.get().setMessages(base.getMessages());
    		baseOptional.get().setStatus(base.getStatus());
    		return baseRepository.save(baseOptional.get());
    	}
    	return null;
    }
    
    
    public String  compareJsons() throws JsonParseException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	TypeReference<HashMap<String, Object>> type = 
    	    new TypeReference<HashMap<String, Object>>() {};
    	    
			InputStream leftJson = TypeReference.class.getResourceAsStream("/json/Base.json");
			
			InputStream rightJson = TypeReference.class.getResourceAsStream("/json/input.json");
			
    	Map<String, Object> leftMap = mapper.readValue(leftJson, type);
    	
    	Map<String, Object> rightMap = mapper.readValue(rightJson, type);
    	
    	Map<String, Object> leftFlatMap = FlatMapUtil.flatten(leftMap);
    	Map<String, Object> rightFlatMap = FlatMapUtil.flatten(rightMap);

    	MapDifference<String, Object> difference = Maps.difference(leftFlatMap, rightFlatMap);
    	StringBuilder builder = new StringBuilder();

    	System.out.println("Entries only on the left\n--------------------------");
    	builder.append("Entries only on the left");
    	difference.entriesOnlyOnLeft()
    	          .forEach((key, value) ->builder.append(key).append(": ").append(value).append(System.getProperty("line.separator"))); //System.out.println(key + ": " + value));

    	System.out.println("\n\nEntries only on the right\n--------------------------");
    	StringBuilder builder2 = new StringBuilder();
    	builder2.append("Entries only on the right");
    	difference.entriesOnlyOnRight()
    	          .forEach((key, value) -> builder2.append(key).append(": ").append(value).append(System.getProperty("line.separator"))); //System.out.println(key + ": " + value));

    	System.out.println("\n\nEntries differing\n--------------------------");
    	StringBuilder builder3 = new StringBuilder();
    	builder3.append("Entries differing");
    	difference.entriesDiffering()
    	          .forEach((key, value) -> builder3.append(key).append(": ").append(value).append(System.getProperty("line.separator"))); //System.out.println(key + ": " + value));
    	builder.append(builder2).append(builder3);
    	ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(builder);
		
    }
    
    public Iterable<Base> list() {
        return baseRepository.findAll();
    }

    public Base save(Base base) {
        return baseRepository.save(base);
    }

    public void save(List<Base> bases) {
    	baseRepository.saveAll(bases);
    }
}
