package com.Cricketer.RestapiApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Cricketer")
public class Cricketer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(name="first_name",nullable=false)
	private String name;
	@Column(name="run_scored")
	private int runscored;
	@Column(name="player_Type")
	private String playerType;
}
