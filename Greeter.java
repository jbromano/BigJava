public class Greeter {

   public Greeter(String greetName) {
      
      name = greetName;
      sayHello();
      
   }
   
   public String sayHello() {
   
      String newGreeting = "Hello, " + name;
      return newGreeting;
   
   }
   
   public String sayGoodbye() {
   
      String goodBye = "Good bye, " + name;
      return goodBye;
   
   }
   
   public String refuseHelp() {
   
      String refusal = "I am sorry, " + name + ".  I am afraid I can't do that.";
      return refusal;
   
   }
   
   public String name;

   public static void main(String args[]) {
   
      Greeter me = new Greeter(args[0]);
      System.out.println(me.sayHello());
      System.out.println(me.sayGoodbye());
      System.out.println(me.refuseHelp());
   
   }
}
