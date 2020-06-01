
public class LinkedList {

	Node head;	
	Node nodeprev=null;

	public void sequence(int data){
		Node node=new Node();
		node.data=data;
		if(head==null){
			head=node;			
		}else{
			Node n=head;
			while(n.next!=null){
				n=n.next;				
			}
			n.next=node;
		}
	}
	
	public void show(){
		Node n=head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	
	public void insert(int pos,int d){
		Node n=head;
		Node n1=new Node();
		n1.data=d;
		while(n.next!=null){
			if(n.data==pos){
				Node newone=n.next;
				n.next=n1;				
				n1.next=newone;
				n=n.next;

			}else{
				n=n.next;
			}
		}		
	}
	
	
	public void remove(){		
		Node n=head;	
		if(n.data==4){
			n=n.next;
			head=n;
		}else{
		while(n.next!=null){
			if(n.data==6){
				nodeprev.next=n.next;
				//n.next=null;
				break;
			}			
			nodeprev=n;
			n=n.next;
		}
	  }
    }
		
	public static void main(String args[]){
		
		LinkedList n=new LinkedList();
		n.sequence(5);
		n.sequence(4);
		n.sequence(3);
		//n.show();
		n.insert(5,6);
	//	n.show();
		n.remove();
		n.show();		
	}
	
}
