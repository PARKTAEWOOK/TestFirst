package liveStudy.ShinsegaeTest;

import java.io.*;

public class Needle {

    public static int count(String needle1, InputStream haystack){
        int result =0;
        BufferedReader br = null;

        String line;

        try{
            br = new BufferedReader(new InputStreamReader(haystack));

//            System.out.println(br);
            while ((line = br.readLine()) != null){
                System.out.println(line);
                result++;
            }
            result--;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if( br != null){
                try{
                    br.close();
                }catch (Exception e){

                }
            }
        }

        return result;
    }
    public static void main(String[] args){
        String inMessage = "Hello, there!! \nHow are You ? \nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())){
            System.out.println(Needle.count("there", inStream));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
