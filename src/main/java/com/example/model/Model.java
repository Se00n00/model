package com.example.model;

import org.nd4j.enums.Mode;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;

@Repository
public class Model {
    public static ArrayList<Object> ModelList = new ArrayList<>();

    static {
        ModelList.add(new Flower_Model());
        ModelList.add(new Fruit_Model());
        ModelList.add(new Flower_Model());
    }



    // TODO: CHANGE THE RETURN DATATYPE 'int' to json type of datatype
    public int getPrediction(int Class) throws IOException {
        if(ModelList.get(Class) instanceof Flower_Model){
            return Flower_Model.predict();
        }else if(ModelList.get(Class) instanceof Fruit_Model){
            return Fruit_Model.predict();
        }else{
            return  Leaves_Model.predict();
        }
    }

    public static ArrayList<Object> getModelList() {
        return ModelList;
    }

    public int getModelCount(){
        return ModelList.size();
    }
}
