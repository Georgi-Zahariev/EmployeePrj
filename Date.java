public class Date {
 private int day,month,year;
 public Date(){
  day=month=year=0;
 }
 public Date(int d,int m,int y){
  day=d;
  month=m;
  year=y;
 }
 public boolean isValid(){
  return day>0 && month>0 && year>0;
 }
 @Override
 public String toString(){
  if (!isValid()) return "Incorrect date";
  return day+"."+month+"."+year;
 }
}
