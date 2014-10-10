package biao;
public class book {	
		private String publishdate;
		
		private String isbn;
		private String publisher;
		private String price;
		private String authorid;
		private String title;
		public book()
        {		
			publishdate = null;
			price = null;
			authorid = null;
			title = null;
			isbn = null;
			publisher=null;
		}
		
		public book(String authorid,String title,String publishdate ,String price,String isbn,String publsher){
			
			this.publishdate = publishdate;
			this.price = price;
			this.authorid = authorid;
			this.title = title;
			this.isbn = isbn;
			this.publisher = publisher;
		}
		
		public String getTitle() 
		{
			return title;
		}
		public void setTitle(String title) 
		{
			this.title = title;
		}
		public String getPublishdate() 
		{
			return publishdate;
		}
		public String getAuthorid() 
		{
			return authorid;
		}
		public void setAuthorid(String authorid) 
		{
			this.authorid = authorid;
		}
		public void setPublishdate(String publishdate) 
		{
			this.publishdate = publishdate;
		}
		public String getPrice() 
		{
			return price;
		}
		public void setPrice(String price) 
		{
			this.price = price;
		}
		
		public String getPublisher() 
		{
			return publisher;
		}
		public String getIsbn() 
		{
			return isbn;
		}
		public void setIsbn(String isbn) 
		{
			this.isbn = isbn;
		}
		public void setPublisher(String publisher) 
		{
			this.publisher = publisher;
		}
	}
