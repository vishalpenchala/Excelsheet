package com.vishal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="player_entity")
public class PlayerEntity {
	
	@Id
	private Integer player_id;
	private String player_name;
	private String player_role;
}
