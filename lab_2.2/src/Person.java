public class Person {
 String name;
 int age;


public Person(String name,int age) {
   super();
   this.name =name;
   this.age= age;
}

void display() {
	System.out.println("Your name is"+name);
	System.out.println("Your age is"+age);
	
}
public static void main(String[] args) {
Person obj=new Person("Prachi",20);
obj.display();
}
}
