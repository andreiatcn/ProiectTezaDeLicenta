package com.iucosoft.proiectfinaljava.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author tacua
 */
public class ImageUtil {

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        File file = new File(imagePath);
        FileInputStream fis = new FileInputStream(file);
        byte[] imageData = new byte[(int) file.length()];
        fis.read(imageData);
        fis.close();
        return imageData;
    }

    public static void convertByteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputPath);
        fos.write(imageData);
        fos.close();
        System.out.println("Image successfully saved to: " + outputPath);
    }
}
