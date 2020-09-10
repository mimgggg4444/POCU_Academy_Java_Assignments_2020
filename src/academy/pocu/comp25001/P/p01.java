package academy.pocu.comp25001.P;

public class p01 {
    public String name;
    public int age;
//       Sex sex;

    public void walk(){
           this.age += 1;    //여기 있는 age는 위에 있는 int age를 사용한다는 의미가 된다.
       }

    public void eat(){
           this.age -= 1;
       }

    public void speak(){
           System.out.println("hello friend");
       }
}
