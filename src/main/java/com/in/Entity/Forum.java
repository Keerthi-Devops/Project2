package com.in.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forum implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id	
	private long forumid;
    private String name;
   
    public Forum(long forumid,String name)
    {
    	this.forumid=forumid;
    	this.name=name;
    }
    public Forum(){
    	forumid=0;
    }
    
    
	public long getForumid() {
		return forumid;
	}


	public void setForumid(long forumid) {
		this.forumid = forumid;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + (int) (forumid ^ (forumid >>> 32));
	        return result;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Forum other = (Forum) obj;
	        if (forumid != other.forumid)
	            return false;
	        return true;
	    }
	 
	
	@Override
    public String toString() {
        return "Forum [forumid=" + forumid + ", name=" + name + "]";
    }
    
   
}
