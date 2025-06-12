package com.turnos.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		@Column(nullable = false)
	    private String name;
	    
	    @Column(nullable = false)
	    private Integer duration;
	    
	    @Column(nullable = false, precision = 10, scale = 2)
	    private BigDecimal price;
	    
	    public Service() {}
	    
	    public Service(String name, Integer duration, BigDecimal price) {
			this.name = name;
			this.duration = duration;
			this.price = price;
		}

		public Long getId() {
			return id;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getDuration() {
			return duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}
}
