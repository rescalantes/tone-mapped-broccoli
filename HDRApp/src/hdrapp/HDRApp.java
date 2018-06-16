/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdrapp;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Rafael
 */

class PyramidsRun {

    String window_name = "Pyramids Demo";

    public void run(String[] args) {
        /// General instructions
        System.out.println("\n" +
                " Zoom In-Out demo    \n" +
                "------------------   \n" +
                " * [i] -> Zoom [i]n  \n" +
                " * [o] -> Zoom [o]ut \n" +
                " * [ESC] -> Close program \n");

        //! [load]
        String filename = ((args.length > 0) ? args[0] : "bluespy.jpg");

        // Load the image
        Mat src = Imgcodecs.imread(filename);

        // Check if image is loaded fine
        if( src.empty() ) {
            System.out.println("Error opening image!");
            System.out.println("Program Arguments: [image_name -- default ../data/chicky_512.png] \n");
            System.exit(-1);
        }
        //! [load]
        OUTER:
        while (true) {
            HighGui.imshow( window_name, src );
            char c = (char) HighGui.waitKey(0);
            c = Character.toLowerCase(c);
            switch (c) {
                case 27:
                    break OUTER;
                    //![pyrup]
                case 'i':
                    Imgproc.pyrUp( src, src, new Size( src.cols()*2, src.rows()*2 ) );
                    System.out.println( "** Zoom In: Image x 2" );
                    //![pyrup]
                    //![pyrdown]
                    break;
                case 'o':
                    Imgproc.pyrDown( src, src, new Size( src.cols()/2, src.rows()/2 ) );
                    System.out.println( "** Zoom Out: Image / 2" );
                    //![pyrdown]
                    break;
                default:
                    break;
            }
        }

        System.exit(0);
    }
}


public class HDRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        new PyramidsRun().run(args);
    }
    
}
