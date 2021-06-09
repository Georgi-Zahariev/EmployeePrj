public class Employee {
 private String name;
 private Date started;
 public Employee(){
  name="";
  started=new Date();
 }
 public void setName(String n){
  name=n;
 }
 public void setStarted(int d,int m,int y){
  started=new Date(d,m,y);
 }
 public boolean isValid(){
  return !name.equals("") && started.isValid();
 }
 @Override
 public String toString(){
  if (!isValid()) return "Data invalid";
  return name+" started on " + started.toString();
 }
}
