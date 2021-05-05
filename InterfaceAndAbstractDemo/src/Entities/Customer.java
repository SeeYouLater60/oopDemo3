package Entities;
import java.time.LocalDate;

import Abstract.IEntity;

public class Customer  implements IEntity{

	
		private int id;
		private String firsName;
		private String lastName;
		private LocalDate dateOfBirth;
		public String nationalityId;
		
		
	


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirsName() {
			return firsName;
		}


		public void setFirsName(String firsName) {
			this.firsName = firsName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public String getNationalityId() {
			return nationalityId;
		}


		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}
	
		
}
