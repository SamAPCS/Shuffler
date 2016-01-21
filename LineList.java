import java.util.ArrayList;

public class LineList {
	
	ArrayList<String> l; 
	
	public LineList(){
		l = new ArrayList<String>();	
	}
	
	public int size(){
		return l.size();
	}
	public String get(int k){
		return l.get(k);
	}
	public void add(String line){
		l.add(line);
	}
	public String remove(int k){
		return l.remove(k);
	}
	public void move(int index, int newIndex){
		l.indexOf(index);
	}
//	public shuffle(){
		
//	}
	public String toString(){
		return l.toString();		
	}
	public static void main(String[] args){
		LineList ll = new LineList();
		ll.add("hi");
		ll.add("anything");
		System.out.println(ll);
//		ll.add("ivy");
		
		
	}
}
