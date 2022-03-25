package com.student.studentcatalogservice.resource;

import com.student.studentcatalogservice.models.CatalogItem;
import com.student.studentcatalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class StudentCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CatalogService service;

    @GetMapping("/{studentID}")
    public ResponseEntity<?> getCatalog(@RequestBody String studentID){
        try{
            return new ResponseEntity<List<CatalogItem>>(service.getCatalogItem(studentID), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}

//            Course course = webClientBuilder.build()
//                    .get().uri("http://localhost:8082/courses/"+grade.getCourseID())
//                    .retrieve()
//                    .bodyToMono(Course.class)
//                    .block();
