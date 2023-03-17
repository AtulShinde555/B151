package com.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	private String playerName;
	private int playerAge;
	String playerState;
	long playerContact;
	String playerEmail;
	@OneToOne(cascade = CascadeType.ALL)
	PlayerRecord playerRecord;
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
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerState() {
		return playerState;
	}
	public void setPlayerState(String playerState) {
		this.playerState = playerState;
	}
	public long getPlayerContact() {
		return playerContact;
	}
	public void setPlayerContact(long playerContact) {
		this.playerContact = playerContact;
	}
	public String getPlayerEmail() {
		return playerEmail;
	}
	public void setPlayerEmail(String playerEmail) {
		this.playerEmail = playerEmail;
	}
	public PlayerRecord getPlayerRecord() {
		return playerRecord;
	}
	public void setPlayerRecord(PlayerRecord playerRecord) {
		this.playerRecord = playerRecord;
	}
	

}
