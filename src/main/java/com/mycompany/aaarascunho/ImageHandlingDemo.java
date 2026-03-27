package com.mycompany.aaarascunho;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ImageHandlingDemo {
    
    public static void main(String[] args) {
        
        int width = 963;
        int height = 640;
        
        BufferedImage image = null;
        
        image = readFromFile(width, height, image);
        
        writeToFile(image);        
        
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            File sampleFile = new File("/home/apferreira/Desktop/image.jpg");
            
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            
            image = ImageIO.read(sampleFile);
            
            System.out.println("Reading complete" + image);
            
        } catch (IOException ex) {
            Logger.getLogger(ImageHandlingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image) {
        try {
            
            File output = new File("/home/apferreira/Desktop/out.jpg");
            
            ImageIO.write(image, "jpg", output);
            
            System.out.println("Writing complete");
            
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }
    
}
