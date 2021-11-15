package Cat;

public class cat {
	// Instance variables
		private String name; 
		private int num_of_lives; 
	// Initialize variables
		public cat(){
			name = "Garfield";
			num_of_lives = 9;
		}
		public cat(String n, int  l){
			name = n;
			num_of_lives = l;
		}
		public String get_name() {
			return name;		
		}
		public int get_num_of_lives() {
			return num_of_lives;		
		}
		public void set_name(String n) {
			name = n;		
		}
		public void set_num_of_lives(int l) {
			num_of_lives = l;		
		}
}
