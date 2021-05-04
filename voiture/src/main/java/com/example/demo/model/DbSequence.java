package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class DbSequence {
	 @Id
	    private String  id;
	    private int seq;
		public DbSequence() {
			
		}
		public DbSequence(String id, int seq) {
			
			this.id = id;
			this.seq = seq;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public void setSeq(int seq) {
			this.seq = seq;
		}
		@Override
		public String toString() {
			return "DbSequence [id=" + id + ", seq=" + seq + "]";
		}
		public int getSeq() {
			return seq;
		}
		
		
			
		
		
	    
}
