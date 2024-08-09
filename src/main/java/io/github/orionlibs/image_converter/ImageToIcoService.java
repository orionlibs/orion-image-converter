package io.github.orionlibs.image_converter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageConverterService
{
    public static void convertImageToJPG(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "jpg", new File(icoPath));
    }


    public static void convertImageToPNG(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "png", new File(icoPath));
    }


    public static void convertImageToBMP(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "bmp", new File(icoPath));
    }


    public static void convertImageToGIF(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "gif", new File(icoPath));
    }


    public static void convertImageToTIF(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "tif", new File(icoPath));
    }


    public static void convertImageToTIFF(File imageFile, String icoPath) throws IOException
    {
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "tiff", new File(icoPath));
    }
}
