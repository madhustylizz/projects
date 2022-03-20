package com.control;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="hello_bro")
public class Player {
	
	@Id
	private int playerId;
	private String playerName;
	private String teamname;
	private int age;
	
	
	public Player(int playerId, String playerName, String teamname, int age) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamname = teamname;
		this.age = age;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamname=" + teamname + ", age=" + age
				+ "]";
	}
	
	

}
