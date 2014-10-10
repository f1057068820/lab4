package biao;
public class author {
		private String authorid;
		private String name;
		private String age ;
		private String country;		
		public author()
		{			
			age = null;
			country = null;
			authorid = null;
			name = null;
		}	
		public author(String authorid,String name,String age,String country)
		{
			this.authorid=authorid;
			this.country=country;
			this.name=name;
			this.age=age;
		}
	

		public void setName(String name) 
		{
			this.name = name;
		}

		public String getName() 
		{
			return name;
		}
		public void setCountry(String country) 
		{
			this.country = country;
		}

		public String getCountry() 
		{
			return country;
		}

		public void setAge(String age) 
		{
			this.age = age;
		}
		public void setAuthorid(String authorid)
		{
			this.authorid = authorid;
		}

		public String getAuthorid() 
		{
			return authorid;
		}

		public String getAge() 
		{
			return age;
		}

		

}
