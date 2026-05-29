import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class BasicEncryption{
    private String string;
    private String textASCII;
    private int ind;
    public BasicEncryption(String string){
        this.string = string;
        this.textASCII = toByte();
    }

    public String toByte(){
        String s = "";
        String str = new String(string);
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        for(byte h : bytes){
            s+=Byte.toString(h);
        }
        return s;
    }

    public String calcP1Encryption(){
        String s = "";
        String AS = new String(textASCII);
        double inLog = Math.log(Double.valueOf(AS)/(string.length()*AS.length()));
        // s=String.valueOf(inLog).substring(0, String.valueOf(inLog).indexOf("."))+String.valueOf(inLog).substring(2);
        this.ind = String.valueOf(inLog).indexOf(".");
        s=String.valueOf(inLog).substring(0, String.valueOf(inLog).indexOf("."))+String.valueOf(inLog).substring(String.valueOf(inLog).indexOf(".")+1);
        return s;
    }

    public double derivative(String s){
        double g = Double.valueOf(s);
        
        return g;
    }
}