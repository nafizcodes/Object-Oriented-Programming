 public class Supplier {
        private int id;                 // Supplier id number
        private String password;        // Supplier password
        private String question;        // Supplier security question
        private String answer;          // Supplier security question answer
        private String name;            // Supplier name
        private String address;         // Supplier address
        
        public Supplier() {
        	
        }
        
		public Supplier(int id, String password, String question, String answer, String name, String address) {
			this.id = id;
			this.password = password;
			this.question = question;
			this.answer = answer;
			this.name = name;
			this.address = address;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		 public String toString() {
            return  "\nId: " + id +
                    "\nPassword:" + password +
                    "\nSecurity question: " + question +
                    "\nAnswer: " + answer +
                    "\nName: " + name +
                    "\nAddress: " + address;
        }
 }
 


