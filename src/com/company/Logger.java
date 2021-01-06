package com.company;
import java.io.*;



public class Logger {

    private static Logger logger = null;

    //not the best option
    private static int verbose = 0;

    private Logger() {
    }


    static {

        try {
            logger = new Logger();

            logger.log("logger starts here");
            logger.log("  file is logfile.txt" + "\"");
            logger.log("  verbosity  " + logger.verbose);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static synchronized Logger getInstance() throws IOException {

        if (logger == null) {

            logger.log("get instance is here, this one is if logger is null\n");
            logger = new Logger();
        }
        logger.log("get instance is being called right here, logger is not null\n");
        return logger;
    }



    public void log (String s) throws IOException {
        if(verbose>=0&& verbose<=2) {
            //IF I HAD MORE TIME I WOULD WORK ON VERBOSE ASPECT OF CODE

            //logger.log("this is the START of the logging procces\n");
            FileWriter fw = new FileWriter("logfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            //logger.log("this is the END of the logging proccess\n");
            bw.newLine();
            bw.close();
        }
        if(verbose>=3){
            //logger.log("this is the START of the logging procces\n");
            FileWriter fw = new FileWriter("logfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            //logger.log("this is the END of the logging proccess\n");
            bw.newLine();
            bw.close();
        }

    }




}




