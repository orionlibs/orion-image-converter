package io.github.orionlibs.image_converter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class ImageToIcoServiceTest extends ATest
{
    private static final String tmpDir = System.getProperty("java.io.tmpdir");


    @Test
    void test_convertImageToJPG() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToJPG(imageFile, tmpDir + "/1.jpg");
        new File(tmpDir + "/1.jpg").delete();
        assertTrue(true);
    }


    @Test
    void test_convertImageToPNG() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToPNG(imageFile, tmpDir + "/1.png");
        new File(tmpDir + "/1.png").delete();
        assertTrue(true);
    }


    @Test
    void test_convertImageToBMP() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToBMP(imageFile, tmpDir + "/1.bmp");
        new File(tmpDir + "/1.bmp").delete();
        assertTrue(true);
    }


    @Test
    void test_convertImageToTIF() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToTIF(imageFile, tmpDir + "/1.tif");
        new File(tmpDir + "/1.tif").delete();
        assertTrue(true);
    }


    @Test
    void test_convertImageToTIFF() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToTIFF(imageFile, tmpDir + "/1.tiff");
        new File(tmpDir + "/1.tiff").delete();
        assertTrue(true);
    }


    @Test
    void test_convertImageToGIF() throws Exception
    {
        Path imagePath = Paths.get(ImageToIcoServiceTest.class.getResource("/io/github/orionlibs/image_converter/images/1.jpg").toURI());
        File imageFile = imagePath.toFile();
        ImageConverterService.convertImageToGIF(imageFile, tmpDir + "/1.gif");
        new File(tmpDir + "/1.gif").delete();
        assertTrue(true);
    }
}
