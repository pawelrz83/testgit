import java.io.*;

public class Test{
   public static void main(String[] args) 
   {
            try
            { 
            Process process = Runtime.getRuntime().exec("youtube-dl --max-downloads=1 ytsearch:\"madonna prayer\" --extract-audio --audio-format mp3");
           
            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
               while ((line=reader.readLine())!=null)
               {
                System.out.println(line);   
                }
             }       
                catch(Exception e)
             { 
                 System.out.println(e); 
             }
               
    }
}
