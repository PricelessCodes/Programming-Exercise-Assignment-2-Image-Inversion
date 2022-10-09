# Programming-Exercise-Assignment-2-Image-Inversion
Java Programming: Solving Problems with Software Course from Coursera

Assignment 2: Image Inversion
Write a program to create new images that are photographic negatives (or inverted images) of selected images and save these new images with filenames that are related to the original images, such as adding “inverted-” in front of the old filename. In inverting an image, a pixel’s red, blue, and green components are modified to be the exact opposite within the 0 to 255 range. That is, if a pixel’s red, blue, and green values are (34, 198, 240), then that same pixel in the inverted image would have the red, blue and green values of (221, 57, 15). Note that 255 - 34 is 221, 255 - 198 is 57, and 255 - 240 is 15.

For example, see the original and inverted images of Robert.

![image](https://user-images.githubusercontent.com/66659379/194773757-7fce6725-ab00-4b7a-8c84-e7961b4354b4.png)
![image](https://user-images.githubusercontent.com/66659379/194773831-a09bdf1a-e059-493c-adfc-3ba4c50131e4.png)

Here is another example. The second image below is the inverted image of the first image.

![image](https://user-images.githubusercontent.com/66659379/194773788-3a13c171-4f58-46ba-8e69-f98accaab6b7.png)
![image](https://user-images.githubusercontent.com/66659379/194773836-7c635d76-edef-45a8-96ab-1aad711fbba9.png)

To tackle this problem:

First think about how to create a new image that is the inverse of another image.

Start by solving an example by hand, write down the steps, find patterns and then test the algorithm

Then create a new BlueJ class called BatchInversions. In this class create a method named makeInversion that has one parameter, an image, and returns a new image that is the inverse of the original image.

Then add another method called selectAndConvert to handle the batch processing of files. This method allows the user to select several files and display the images. Test this method to make sure it works.

Then modify the selectAndConvert method to save each inverted image as a file with a new filename. Use the old filename and append to the front of it “inverted-”
