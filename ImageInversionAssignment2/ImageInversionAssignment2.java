
/**
 * Write a description of ImageInversionAssignment2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class ImageInversionAssignment2 {
	//I started with the image I wanted (inImage)
	public ImageResource ImageInversion(ImageResource inImage) {
		//I made a blank image of the same size
		ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
		//for each pixel in outImage
		for (Pixel pixel: outImage.pixels()) {
			//look at the corresponding pixel in inImage
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			//compute inPixel's red + inPixel's blue + inPixel's green
			//divide that sum by 3 (call it average)
			int invertedRed = 255 - inPixel.getRed();
			int invertedGreen = 255 - inPixel.getGreen();
			int invertedBlue = 255 - inPixel.getBlue();
			//set pixel's red to average
			pixel.setRed(invertedRed);
			//set pixel's green to average
			pixel.setGreen(invertedGreen);
			//set pixel's blue to average
			pixel.setBlue(invertedBlue);
		}
		//outImage is your answer
		return outImage;
	}
	
	public void selectAndConvert () {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource inverted = ImageInversion(inImage);
			
			String fname = inImage.getFileName();
			String newName = "inverted copy-" + fname;
			inverted.setFileName(newName);
			
			//gray.draw();
			inverted.save();
		}
	}
}
