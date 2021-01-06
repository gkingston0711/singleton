package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("START OF THE PROCESS");

       Logger LOG = Logger.getInstance();

        LOG.log("Stuff should be happening at END of log");

       Logger LOG2 = Logger.getInstance();

        if(LOG2==LOG){
            System.out.println("look to be the SAME log\n");
        }
        else{
            System.out.println("look to be different logs\n");
        }
    }
}
