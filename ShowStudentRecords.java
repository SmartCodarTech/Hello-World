import java.util.*;
import java.text.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.IOError;

public class ShowStudentRecords
{
    static int counter=1; // loop counter
    static String comment="";  //grading comment 
    static double point=0;// grade point 
    
    public ShowStudentRecords()
    {}
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df =new DecimalFormat("0.00");
        GregorianCalendar cal =new GregorianCalendar();
        
        
        System.out.println(" Enter Full Name");
        String name=br.readLine();
        
        System.out.println(" Enter ID number");
        String index=br.readLine();
        
        System.out.println(" Enter Program");
        String program=br.readLine();
        
        while(counter<=1)
        {
        System.out.println(" Enter Total number of credit hours");
        int credit=Integer.parseInt(br.readLine());
        
        System.out.println(" Enter Total number of grade point");
        double grade=Double.parseDouble(br.readLine());
        
        if(credit<3|| grade<=0)
        {
          System.out.println(" Please check your figures properly");
          continue;
        }
        
        point=grade/(double)credit;
        if(point>=3.60)
        {
            comment="First Class";
        }
        else if(point>3.00 && point<3.60)
        {
            comment="Sceond Class upper";
        }
        else if(point>2.00 && point<3.00)
        {
            comment="Second Class Lower";
        }
        else if(point>1.50 && point<2.00)
        {
            comment="Third Lower";
        }
        else if(point>1.00 && point<1.50)
        {
            comment="Pass";
        }
        else if(point<1.00)
        {
            comment="Fail";
        }
        
        StudentInfos info=new StudentInfos(name,index,program);
        info.ShowRecord();
        System.out.println(" Student's Credit         "+credit);
        System.out.println(" Student's Grade          "+grade);
        System.out.println(" Student's Grade point    "+df.format(point));
        System.out.println(" Student's Class          "+comment);
        System.out.println(" Student's Time           "+cal.getTime());
      counter++;  
    }
    }
    
}