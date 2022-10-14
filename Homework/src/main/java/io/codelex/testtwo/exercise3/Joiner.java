package io.codelex.testtwo.exercise3;

public class Joiner {
    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }
    public <T> String join(T...args){
        String result = args[0].toString();
        if(args.length>1) {
            for (int i = 1; i<args.length; i++) {
                result += seperator + args[i].toString();
            }
        }
        return result;
    }
}
