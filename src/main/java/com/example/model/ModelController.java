package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Creating the REST controller
@SpringBootApplication
@RestController
//@RequestMapping(path = "/employees")
public class ModelController {

    @Autowired
    private Model model;

    // Implementing a GET method
    @GetMapping(path = "/", produces = "application/json")
    public int ModelCounts()
    {
        return model.getModelCount();
    }

    @PostMapping("/predict")
    public ResponseEntity<Map<String, Object>> predict(
            @RequestParam("image") MultipartFile imageFile,
            @RequestParam("classIndex") int classIndex) throws IOException {

        Map<String, Object> response = new HashMap<>();


        // TODO: pass model.getPrediction(classIndex, image)
        // TODO: build reponses
        byte[] imageBytes = imageFile.getBytes();
        response.put("Classifies", model.getPrediction(classIndex));
//            Image image = ImageFactory.getInstance().fromInputStream(imageFile.getInputStream());
//
//            // Load the model
//            try (Model model = Model.newInstance("image-classification")) {
//                model.load(modelPath);
//
//                // TODO : Perform prediction
//                try (ai.djl.inference.Predictor<Image, Classifications> predictor = model.newPredictor()) {
//                    Classifications predictions = predictor.predict(image);
//
//                    // Check if the predicted class matches the provided class index
//                    String predictedClass = predictions.best().getClassName();
//                    boolean match = classIndex == Integer.parseInt(predictedClass);
//
//                    // TODO : Build the response
//                    response.put("predictedClass", predictedClass);
//                    response.put("confidence", predictions.best().getProbability());
//                    response.put("match", match);
//                }
//            }

        return ResponseEntity.ok(response);
    }

    // Create a POST method
//    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//    public int addEmployee(@RequestBody Employee employee)
//    {
//
//        // Creating an ID of an employee
//        // from the number of employees
//        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//
//        employee.setId(id);
//
//        employeeDao.addEmployee(employee);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();
//        return employeeDao.getAllEmployees();
////        return ResponseEntity
////                .created(location)
////                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ModelController.class, args);
    }
}
