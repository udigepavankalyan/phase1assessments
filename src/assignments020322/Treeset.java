package assignments020322;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		        
		        System.out.println("Enter the input Strings to be added in TreeSet");
		        
		        Scanner input = new Scanner(System.in); 
		        // comnnad line to take user input
		        String s1 = input.nextLine();
		        String s2 = input.nextLine();
		        String s3 = input.nextLine();
		        String s4 = input.nextLine();
		        String s5 = input.nextLine();
		        String s6 = input.nextLine();
		        


		        
		        
		        treeSet.add(s1);
		        treeSet.add(s2);
		        treeSet.add(s3);
		        treeSet.add(s4);
		        treeSet.add(s5);
		        treeSet.add(s6);
		        
		        System.out.println("TreeSet is : " + treeSet);
		        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
		        
		        System.out.println(treeSet.contains("Innddd"));
		        
		        treeSet.remove(s2);
		        System.out.println("After removing element : " + s2 + " TreeSet is : " + treeSet);
		        
		        
		        treeSet.remove(s5);
		        System.out.println("After removing element : " + s5+ " TreeSet is : " + treeSet);


			}

		}
