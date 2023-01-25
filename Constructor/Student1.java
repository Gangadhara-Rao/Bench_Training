class Student1{  
    int id;  
    String name;  
    Student2(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student1 s1 = new Student1(1,"ganga");  
    Student1 s2 = new Student1(2,"Aryan");    
    s1.display();  
    s2.display();  
   }  
}  