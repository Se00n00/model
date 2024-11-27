package com.example.model;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;

@Repository
public class Model {
    private static ArrayList<Object> ModelList = new ArrayList<>();

    static {
        ModelList.add(new Flower_Model());

//        TODO : ADD THE FRUITS AND LEAVES MODEL
    }



    // TODO: CHANGE THE RETURN DATATYPE 'int' to json type of datatype
    public int getPrediction(int Class, INDArray imageData) throws IOException {
        if(ModelList.get(Class) instanceof Flower_Model){
            return Flower_Model.predict(imageData);
        }else if(ModelList.get(Class) instanceof Fruit_Model){
            return Fruit_Model.predict(imageData);
        }else{
            return  Leaves_Model.predict(imageData);
        }
    }

    public int getModelCount(){
        return ModelList.size();
    }
}
