public class Test{
   public static void main(String[] args) {
    Stack<Auto> Autokaufhaus = new Stack<Auto>();
    Auto Lambo = new Auto("Lambo","1");
    Auto VW = new Auto("VW","2");
    
    Autokaufhaus.push(Lambo);
    System.out.println(Autokaufhaus.top().getModell());
    Autokaufhaus.pop();
    System.out.println(Autokaufhaus.top());
    Autokaufhaus.push(Lambo);
    Autokaufhaus.push(VW);
    System.out.println(Autokaufhaus.top().getModell()); 
   }
  }