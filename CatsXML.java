import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
 */

public class CatsXML{
    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<Cat> cats = new ArrayList<>();

        // add some cats
        cats.add(new Cat("Emerson", 17));
        cats.add(new Cat("Rincewind", 1));
        cats.add(new Cat("Alax", 16));

        printList(cats);

        // **** write the list to an xml file ****
        // open the output stream
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("cats.xml"));
        //encoder.writeObject(cats);

        /* let's see what the file looks
         * like when we write a series of individual
         * Cat objects to the file
         */
        for(Cat c : cats){
            encoder.writeObject(c);
        }
        encoder.close();

        XMLDecoder decoder = null;

        // ****** now read it back *************
        System.out.println();
        System.out.println("--------------- Print file contents ---------------");
        
        
        try{
            decoder = new XMLDecoder(new FileInputStream("c ats.xml"));
        }// end try
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
            decoder = null;
        }

        ArrayList<Cat> newCats = new ArrayList<>();
        //newCats = (ArrayList)decoder.readObject();

        if(decoder != null){
            System.out.println("Reading XML file.");
            loadCats(newCats, decoder);
            decoder.close();
        }// end decoder not null

        System.out.println();
        printList(newCats);
        

        System.out.println("end of program");
    }

    public static void loadCats(ArrayList<Cat> cats, XMLDecoder decoder){
        boolean eof = false;

        while(!eof){
            try{
                cats.add((Cat)decoder.readObject());
            }// end try
            catch(ArrayIndexOutOfBoundsException e){
                eof  = true;
                System.out.println("eof reached");
            }// end catch
        }
    }

    /*****************************************
     * Description: Print a list of Cats
     * 
     * @param        ArrayList<Cat>: a list of cats
     * 
     * @return       nothing
     * ****************************************/
    public static void printList(ArrayList<Cat> list){
        for(Cat c : list){
            System.out.println(c);
        }
    }
}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
