  import jade.core.Agent;
  //comment number 1
  public class HelloAgent extends Agent 
  { 
      protected void setup() 
      { 
          System.out.println("Hello World. ");
          System.out.println("My name is "+ getLocalName()); 
          //new comment
      }
  }
