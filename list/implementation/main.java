public class main{
      public static void main(String[] args){
            List<Auto> liste = new List<Auto>();
            Auto a1 = new Auto("Audi", "A3");
            Auto a2 = new Auto("Lambo", "Aventador");
            Auto a3 = new Auto("Benzer", "AMG");
            
            List<Auto> liste2 = new List<Auto>();
            Auto a4 = new Auto("a", "b");
            Auto a5 = new Auto("c", "d");
            
            liste2.append(a4);
            liste2.append(a5);
            
            liste.append(a1);
            liste.append(a2);
            System.out.println(liste.getFirst().getContent().getModell());
            System.out.println(liste.getLast().getContent().getModell());
            liste.toLast();
            liste.insert(a3);
            liste.toFirst();
            liste.next();
            System.out.println(liste.getContent().getModell());
            liste.remove();
            System.out.println(liste.getContent().getModell());
            
            liste.concat(liste2);
            liste.toLast();
            System.out.println(liste.getLast().getContent().getModell());
      }
  }