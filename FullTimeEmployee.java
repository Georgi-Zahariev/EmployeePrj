public class FullTimeEmployee extends Employee {
 private int pensiontier;
 public FullTimeEmployee(){
  super();
  pensiontier=0;
 }
 public void setPensionTier(int t){
  pensiontier=t;
 }
 @Override
 public boolean isValid(){
  return super.isValid() && pensiontier>0 && pensiontier<4;
 }
 @Override
 public String toString(){
  if (!isValid()) return "Data not valid";
  return super.toString()+", tier="+pensiontier;
 }
}
