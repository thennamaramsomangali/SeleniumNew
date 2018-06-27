package HwJavaWeek2;

		import java.util.ArrayList;
		import java.util.HashSet;
		import java.util.LinkedHashSet;
		import java.util.List;
		import java.util.Set;
		import java.util.TreeSet;
			/**
			 * Date: 24 Feb 2018
			 * 
			 * Set is a Collection that cannot contain duplicate elements.
			 * The order of a map is defined as the order depends on implementation
			 * 
			 * Set implementations: HashSet, TreeSet, and LinkedHashSet.
			 * 
			 * HashSet, which stores its elements in a hash table, is the best-performing implementation; 
			 * however it makes no guarantees concerning the order of iteration.
			 * 
			 * Incase of ordered to be maintained, use LinkedHashSet
			 * 
			 * Methods we will learn today
			 * 
			 * size, add, remove, clear, isEmpty
			 * 
			 * 
			 */
			
		public class Sets {

			public static void main(String[] args) {
		
				
				// Create a set
				Set<String> mentors = new TreeSet<String>(); //ascii order
				//Set<String> mentors = new HashSet<String>(); //random order
				//Set<String> mentors = new LinkedHashSet<String>(); //order of insert
				
				// Add mentors to the set -- Note the order
				mentors.add("Rasheed");
				mentors.add("Gopi");
				mentors.add("Sethu");
				mentors.add("Nesa");
				mentors.add("Sarath");
				mentors.add("Babu");		
				mentors.add("AA");
				// Now get the count
				System.out.println("The total mentors are :"+mentors.size());
				List<String> allMentors = new ArrayList<String>();
				allMentors.addAll(mentors);
				allMentors.get(0);
				
				for (String mentor : mentors) {
					System.out.println(mentor);
				}
				
				// Try duplicate
				mentors.add("Gopi");
				
				// Now get the count
				System.out.println("The total mentors are :"+mentors.size());
						
				// Print the name of all mentors -- you will notice the order in the list not maintained
				for (String mentor : mentors) {
					System.out.println(mentor);
				}
				
				// contains
				System.out.println("Is Gopi is available "
						+ "in the set :"+mentors.contains("Gopi"));
				
				// remove
				mentors.remove("Gopi");
				
				//check the size of mentors
				System.out.println("The total mentors are :"+mentors.size());
				
				// contains
				System.out.println("Is Gopi is available in the set"
						+ " after removal :"+mentors.contains("Gopi"));
				
				// clear
				mentors.clear();
				
				// check if it empty
				System.out.println("The set is empty :"
						+ ""+mentors.isEmpty());		
			}
		

	}


