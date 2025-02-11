package tp3exosYaip7;

public class Customer {

	
	private String name;
	private boolean member;
	private String memberType;
	
	
	public Customer (String name) {
		this.name = name;
		member = false;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}

	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean Member) {
		member = Member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType (String Type) {
		memberType = Type;
	}
	
	public String toString () {
		return "Name : "+name+" Member Type : "+memberType;
	}
}
