/*package com.in.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in.Entity.Forum;



@Repository
public class ForumDAOImpl
{
	private static List forums;
	
	public Forum add(Forum forum) 
	{
		forum.setForumid(System.currentTimeMillis());
		forums.add(forum);
		return forum;
	}
	
	
	{
		forums = new ArrayList();
		forums.add(new Forum(101, "John"));
		forums.add(new Forum(201, "Russ"));
		forums.add(new Forum(301, "Kate"));
	}

	
	public List list() {
		return forums;
	}
	}





@Autowired
	 private SessionFactory session;
	 
	 
	     private static final AtomicLong counter = new AtomicLong();
    
    private static List<Forum> Forums;
    
    static{
    	Forums= populateDummyForums();
    }

	
	 static HashMap<Integer,Forum> froumIdMap=getFroumIdMap(); 
	 
	 public FroumDAO() {  
		  super();  
		  
		  if(froumIdMap==null)  
		  {  
			  froumIdMap=new HashMap<Integer,Forum>();  
		  // Creating some objects of Country while initializing  
			  Forum indiaCountry=new Forum(1, "India",10000);  
			  Forum chinaCountry=new Forum(4, "China",20000);  
			  Forum nepalCountry=new Forum(3, "Nepal",8000);  
			  Forum bhutanCountry=new Forum(2, "Bhutan",7000);  
		  
		  
			  FroumIdMap.put(1,indiaCountry);  
			  FroumIdMap.put(4,chinaCountry);  
		   FroumIdMap.put(3,nepalCountry);  
		   FroumIdMap.put(2,bhutanCountry);  
		  }  
		 }  

		Read more at http://www.java2blog.com/2016/04/spring-restful-web-services-crud-example.html#KCDSpEO5mCWixyDc.99


	@Transactional
	public void add(Forum forum) {
		Forums.add(forum);
}

	@Transactional
	public void update(Forum forum) {
		Session s=session.getCurrentSession();
		s.update(forum);
		s.flush();
	}

	

	@Transactional
	public List<Forum> getForumID() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	private static List<Forum> populateDummyForums()
	{
        List<Forum> forum = new ArrayList<Forum>();
        forum.add(name, "Sam");
        forum.add(new Forum(counter.incrementAndGet(),"Tom"));
        forum.add(new Forum(counter.incrementAndGet(),"Jerome"));
        forum.add(new Forum(counter.incrementAndGet(),"Silvia"));
        return Forums;
    }

	@Transactional
	public List<Forum> list() {
		return Forums;
	}

	@Override
	public List Forums() {
		// TODO Auto-generated method stub
		return null;
	}


*/