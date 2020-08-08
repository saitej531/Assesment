package studentassesment;


	
	import java.util.*;
	
	import java.util.Set;
	import java.util.Map;
	

	public class Stud1Main {
		// private Set<Student> set = new HashSet<>();
	
		private Map<String, Stud1> a;
		

		public static void main(String[] args) {
			Stud1Main run = new Stud1Main();
			run.runApp();
		}

		public void runApp() {
			a.put("a1", (new Stud1("a1", 22, "sai")));
			a.put("b2", (new Stud1("a2", 25, "teja")));
			a.put("c3", (new Stud1("a3", 20, "ashok")));
			a.put("d4", (new Stud1("a4", 27, "jaggu")));
			app();
		}

		public void app() {
			Set<String> keys = a.keySet();
			for (String k : keys) {
				Stud1 s = a.get(k);
				
				List<String>r= new ArrayList();
			    r.add(s.getRollNo());

				if (s.getAge() % 2 == 0) {
					Set<Stud1> se = new HashSet();
					se.add(a.get(k));

				} else {
					Set<Stud1> sl = new HashSet();
					sl.add(a.get(k));
				}
				
				for (String r1:r) {
					System.out.println(r1);
					
				}
			}

		}
	}
	


