/*Problem Statement

A gym wants to maintain basic information about its members.

Create a class:

GymMember

Each member should have:

memberId
memberName
membershipMonths
Requirements
All fields must be private.
memberId:
Must be greater than 0.
Can be assigned only once.
Can be viewed using a getter.
memberName:
Can be viewed and changed.
Cannot be null or empty.
membershipMonths:
Can be viewed.
Should not have a normal setter.
Initially it will be 0.
Create:
addMembership(int months)

It should:

Accept only values greater than 0.
Add the months to the existing membership months.
Otherwise print "Invalid membership duration".
Create:
useMembershipMonth()

It should:

Reduce membershipMonths by 1.
Only reduce it when at least one month is available.
Otherwise print "No active membership". */
public class GymMembership {
    private int memberId;
    private String memberName;
    private int membershipMonths;

    public void setMemberId(int memberId){
        if(this.memberId == 0 && memberId > 0){
            this.memberId = memberId;
        }else{
            System.out.println("Invalid Member ID or Member ID already assigned");
        }
    }

    public int getMemberId(){
        return memberId;
    }

    public void setMemberName(String memberName){
        if(memberName != null && !memberName.isEmpty()){
            this.memberName = memberName;
        }else{
            System.out.println("Invalid member Name");
        }
    }

    public String getMemberName(){
        return memberName;
    }

    public int getMemberShipMonths(){
        return membershipMonths;
    }

    public void addMembership(int months){
        if(months > 0){
            this.membershipMonths = this.membershipMonths + months;
            System.out.println(months + "membership months dded ");
        }else{
            System.out.println("Invalid membership duration");
        }
    }

    public void useMembershipMonth() {

        if(this.membershipMonths > 0) {

            this.membershipMonths =
                    this.membershipMonths - 1;

            System.out.println(
                "One membership month used"
            );

        } else {

            System.out.println(
                "No active membership"
            );
        }
    }
    public static void main (String args[]){
        GymMembership member = new GymMembership();

        member.setMemberId(201);

        member.setMemberName("Pranit");

        member.addMembership(6);

        System.out.println(
            "Membership Months: "
            + member.getMemberShipMonths()
        );

        member.useMembershipMonth();

        System.out.println();
        System.out.println("Member Details");

        System.out.println(
            "Member ID: " + member.getMemberId()
        );

        System.out.println(
            "Member Name: " + member.getMemberName()
        );

        System.out.println(
            "Remaining Membership: "
            + member.getMemberShipMonths()
            + " months"
        );
    }
}
