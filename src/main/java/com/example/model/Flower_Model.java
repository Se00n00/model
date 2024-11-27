package com.example.model;
//import org.deeplearning4j.models.pretrained.PrebuiltModel;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler;

import java.io.File;
import java.io.IOException;

public class Flower_Model {
    public static int predict(INDArray imageData) throws IOException {
        File modelFile = new File("/home/se00n00/Downloads/model/src/main/resources/flower_model_weights.zip");

        MultiLayerNetwork model = ModelSerializer.restoreMultiLayerNetwork(modelFile);
//        PrebuiltModel resNetModel = PrebuiltModel.RESNET_50;
//        MultiLayerNetwork model = resNetModel.getModel();
        return 1;
//        System.out.println("Model Loaded Succesfully");
    }

//    public static void main(String[] args) throws IOException {
//        File imageFile = new File("/home/se00n00/Downloads/S.jpg");
//
//        // Define image dimensions and channels
//        int height = 100;  // Example height
//        int width = 100;   // Example width
//        int channels = 3;  // RGB channels (3) or Grayscale (1)
//
//        // Load the image as an INDArray
//        NativeImageLoader loader = new NativeImageLoader(height, width, channels);
//        INDArray image = loader.asMatrix(imageFile);
//
//        // Normalize pixel values (0-255 -> 0-1)
//        ImagePreProcessingScaler scaler = new ImagePreProcessingScaler(0, 1);
//        scaler.transform(image);
//
//        // Print the INDArray
//        System.out.println("Image INDArray: " + flower(image));
//    }
}
