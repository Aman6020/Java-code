package mypack;
class student_bean
{
 int rollno, marks;
String name,grade;
public void setRollno(int rollno)
{
 this.rollno=rollno;
}
public int getRollno()
{
 return(rollno);
}
public void setmarks(int marks)
{
 this.marks=marks;
}
public int getmarks()
{ 
return (marks);
}
public void setname(String name)
{
 this.name=name;
}
public int getname()
{
 return (name);
}
 public void setgrade(String grade)
{
 this.grade=grade;
}
public String getgrade()
{
    return(grade);
}
//business logic 
public boolean register()
{
 try
{
 if (marks>=80)
grade="A";
else if(marks>=60)
grade="B";
else if(marks>=40)
grade="C";
else
grade="D";

Connection con=connectionprovider.getConnection();
PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
ps.setString(1,name);
ps.setString(4,grade);
ps.setString(2,rollno);
ps.setString(3,marks);
int x=ps.executeUpdate();
if(x==1)
{
 return(true);
}
return (false);
}
catch(Exception e)
{
e.printStackTrace();
  return(false);
}
}
}