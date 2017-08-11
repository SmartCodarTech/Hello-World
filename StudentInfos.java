
public class StudentInfos implements Student 
{
    private String stu_name;
    private String stu_index;
    //private double stu_grade_point;
    private String stu_program;
    
    public StudentInfos(String stu_name,String stu_index, String stu_program)
    {
        this.stu_name=stu_name;
        this.stu_index=stu_index;
       // this.stu_grade_point=stu_grade_point;
        this.stu_program=stu_program;
    }
    public void ShowRecord()
    {
        System.out.println(" Students Name:           "+stu_name);
        System.out.println(" Student's Index          "+stu_index);
        System.out.println(" Student's program        "+stu_program);
       
    }
    
    public Student getStudentName()
    {
       return new StudentInfos(stu_name,stu_index,stu_program);
    }
            
    
}
