
public class Main {
 public static void main(String[] args){
	 Integer i=new Integer(1);
	 String s=new String("2");
	 Student<Integer> s1=new Student (1,i);
	 Student<String> s2=new Student(2,s);
	 System.out.println("s1.e:"+s1.e+"; s1.id:"+s1.id+"; s1.class type:"+s1.getClass()+"; s1 Id type:"+s1.e.getClass());
	 System.out.println("s2.e:"+s2.e+"; s1.id:"+s2.id+"; s2.class type:"+s2.getClass()+"; s2 Id type:"+s2.e.getClass());
 }
 
}
