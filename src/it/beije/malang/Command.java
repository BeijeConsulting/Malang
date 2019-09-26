package it.beije.malang;

public class Command {
	private int cmdId;
	private String argument;
	
	public int getCmdId() {
		return cmdId;
	}
	
	public String getArgument() {
		return argument;
	}
	
	public void setCmdId(int cmdId) {
		this.cmdId = cmdId;
	}
	
	public void setArgument(String argument) {
		this.argument = argument;
	}
}
