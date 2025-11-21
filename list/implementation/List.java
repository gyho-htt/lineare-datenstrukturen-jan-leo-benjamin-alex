public class List<ContentType>{
  private class ListNode {

    private ContentType content = null;
    private ListNode BehindNode = null;
   
    public ListNode(ContentType pContent) {
      content = pContent;
      BehindNode = null;
    }

    public void setBehind(ListNode pBehind) {
      BehindNode = pBehind;
    }
    
    public ListNode getBehind() {
      return BehindNode;
    }

    public ContentType getContent() {
      return content;
    }
    
    public void setContent(ContentType pContent){
      this.content = pContent;
      
    }
  }
  private ListNode aktuellesNode;
  private ListNode erstes;
  private ListNode letztes;
  
  

  public List(){
    
  }

  public boolean isEmpty(){
    if (this.erstes == null) {
      return true;
    } // end of if
    else {
      return false;
    } // end of if-else
  }

  public boolean hasAccess(){
    if (aktuellesNode == null) {
      return false; 
    } // end of if
    else {
      return true;
    } // end of if-else
  }

  public void next(){
    if (!isEmpty() && this.hasAccess() && this.aktuellesNode != this.letztes) {
      this.aktuellesNode = this.aktuellesNode.getBehind();  
      } 
    else {
      this.aktuellesNode = null;
    } // end of if-else    
    }
   


  public void toFirst(){
    if (this.isEmpty() == false) {
      this.aktuellesNode = this.erstes;
    } 
  }

  public void toLast(){
    if (this.isEmpty() == false) {
      this.aktuellesNode = this.letztes;
    }
  }

  public ContentType getContent(){
    if (this.hasAccess()) {
      return this.aktuellesNode.getContent();
    }                           
    else {
      return null;
    } // end of if-else
  }
  
  public void setContent(ContentType pContent){
    if (this.hasAccess() && pContent != null) {
      //ListNode n1 = new ListNode(pContent);  -> neues Node erzeugen mit pContent
      //aktuellesNode = n1;                    -> n1 ist aktuelles Node
      aktuellesNode.setContent(pContent);
    }
  }
  
  public void append(ContentType pContent){
    if (pContent != null) {
      ListNode n1 = new ListNode(pContent);
      if (this.isEmpty()) {
        this.letztes = n1;
        this.erstes = n1;
        
      } // end of if
      else if (this.isEmpty() == false) {
        this.letztes.setBehind(n1);
        this.letztes = n1;
      }
    }
    
  }
  
  public void insert(ContentType pContent){
    ListNode n1 = new ListNode(pContent);
    
    if (hasAccess() == true) {
      ListNode a = new ListNode(pContent);
      if (aktuellesNode == letztes) {
        
        this.append(pContent);
      } 
      else  {
        a = this.aktuellesNode.getBehind();
        this.aktuellesNode.setBehind(n1);
        n1.setBehind(a);
      } 
    }
    if (isEmpty()) {
      this.append(pContent);
    } // end of if 
      
         }  
         
      // insert noch gar nicht fertig, was meint vor? braucht ein node einen Vor und nachgänger
  // oder reicht ein Nachfolger? -> Nachfolger reicht glaube ich. Ist der andere Code logisch
      
      public void concat(List<ContentType> pList){
      
      }
      
      public void remove(){
      
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}    