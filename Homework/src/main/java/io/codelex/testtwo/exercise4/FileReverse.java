package io.codelex.testtwo.exercise4;

import java.io.*;

public class FileReverse {
    private String path;

    public FileReverse(String path) {
        this.path = path;
    }
    public void reverseFile() throws IOException {
        String[] paths = path.split("/");
        String[] name = paths[paths.length-1].split("\\.");
        String pathNoName=paths[0];
        for(int i = 1; i<paths.length-1; i++){
            pathNoName+="/"+paths[i];
        }
        StringBuilder nameReversed = new StringBuilder(name[0]);
        for(int i = 1; i<name.length-1; i++){
            nameReversed.append("."+name[i]);
        }
        nameReversed.reverse();
        //File file = new File(nameReversed.toString()+"."+name[name.length-1]);

        BufferedReader in = new BufferedReader(new FileReader(path));
        BufferedWriter out = new BufferedWriter(new FileWriter(pathNoName+"/"+nameReversed.toString()+"."+name[name.length-1]));
        String line;
        while((line = in.readLine())!=null){
            StringBuilder lineReverse = new StringBuilder(line);
            out.write(lineReverse.reverse().toString()+"\n");
        }
        in.close();
        out.close();
    }
}
