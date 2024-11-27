package com.example.model;
//import org.deeplearning4j.models.pretrained.PrebuiltModel;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler;

import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.factory.Nd4j;
import org.deeplearning4j.nn.modelimport.keras.KerasModelImport;

import org.tensorflow.*;

import java.io.File;
import java.io.IOException;

public class Flower_Model {
    public static int predict() throws IOException {
//        String modelFile = "/home/se00n00/Downloads/model/src/main/resources/tf_model.pb";
////
//        SavedModelBundle model = SavedModelBundle.load(modelFile,"serve");
//        Graph graph = model.graph();
//
//        Session session = new Session(graph);
//        Tensor input = Tensors.create("/home/se00n00/Downloads/model/src/main/resources/Apple.jpg");
//        Tensor output = session.runner()
//                .feed("input_tensor_name", input)  // Replace with input tensor name
//                .fetch("output_tensor_name")             // Replace with output tensor name
//                .run()
//                .get(0);
//        float[] Res = new float[(int) output.size()];
//
//        System.out.println("Predicted class: " + output);
        return 1;
//        System.out.println("Model Loaded Succesfully");
    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(predict());
////        try {
////            // Path to your ONNX model
////            String modelpath = "/home/se00n00/Downloads/model/src/main/resources/fruit_model.h5";
////
////            // Load the ONNX model as a ComputationGraph
////            MultiLayerNetwork Model = KerasModelImport.importKerasSequentialModelAndWeights(modelpath);
////
////            // Print the model summary to ensure it loaded correctly
////            System.out.println(Model.summary());
//////            System.out.println(Model);
////
////            // Test with random input data
////            INDArray input = Nd4j.randn(new int[]{1,100,100,3}); // Example for image data
////            INDArray[] output = new INDArray[]{Model.output(input)};
////
////            System.out.println("Output: " + output[0]);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//    }
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
