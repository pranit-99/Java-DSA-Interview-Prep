public class GymMembershipIntermediate {
    private int memberId;
    private String memberName;
    private int membershipMonths;
    private int usedMonths;
    private double totalAmountPaid;

    //----------------Setting & Getting membr ID-----------
    public void setMemberId(int memberId){
        if(this.memberId == 0 && memberId > 0){
            this.memberId = memberId;
            System.out.println("Member ID assigned successfully");
        }else{
            System.out.println("Invalid Member ID or Member ID already assigned");
        }
    }

    public int getMemberID(){
        return memberId;
    }

    //------------------Setting and Getting Member Name----------
    public void setMemberName(String memberName){
        if(this.memberName != null && !memberName.isEmpty()){
            this.memberName = memberName;
            System.out.println("Member name assigned successfully");
        }else{
            System.out.println("Invalid Member Name cannot be Null");
        }
    }

    public String getMemberName(){
        return memberName;
    }

    //Getting MemberShip Months
    public int getMembershipMonths(){
        return membershipMonths;
    }

    public int getUsedMonths(){
        return usedMonths;
    }

    public double getTotalAmountPaid(){
        return totalAmountPaid;
    }

    //Purchase MemberShip
    public void purchaseMembership(int months) {

        if (months <= 0) {

            System.out.println("Invalid membership duration");

        } else {

            double normalCost = months * 50.0;
            double discount = 0.0;
            double finalCost;

            if (months >= 12) {

                discount = normalCost * 0.20;

            } else if (months >= 6) {

                discount = normalCost * 0.10;

            }

            finalCost = normalCost - discount;

            this.membershipMonths =
                    this.membershipMonths + months;

            this.totalAmountPaid =
                    this.totalAmountPaid + finalCost;

            System.out.println("Membership purchased successfully");
            System.out.println("Normal Cost: $" + normalCost);
            System.out.println("Discount: $" + discount);
            System.out.println("Amount Paid: $" + finalCost);
        }
    }

    //Used MemberShip
    public void useMembershipMonth(){
        if(this.membershipMonths == 0){
            System.out.println("No active membership months");
        }else{
            this.usedMonths = this.usedMonths + 1;
            this.membershipMonths = this.membershipMonths - 1;
            System.out.println("Membership month used successfully");
        }
    }

    //Calculate Average Monthly Cost
    public double calculateAverageMonthlyCost() {

        int totalMonthsPurchased =
                this.membershipMonths + this.usedMonths;

        if (totalMonthsPurchased == 0) {
            return 0.0;
        }

        return this.totalAmountPaid / totalMonthsPurchased;
    }

    
public static void main(String args[]){
    GymMembershipIntermediate member = new GymMembershipIntermediate();
    member.setMemberId(201);
        member.setMemberName("Pranit");

        System.out.println("--------------------------------");

        // Purchase 6 months
        member.purchaseMembership(6);

        System.out.println("--------------------------------");

        System.out.println(
            "Remaining Months: "
            + member.getMembershipMonths()
        );

        System.out.println(
            "Used Months: "
            + member.getUsedMonths()
        );

        System.out.println(
            "Total Amount Paid: $"
            + member.getTotalAmountPaid()
        );

        System.out.println(
            "Average Monthly Cost: $"
            + member.calculateAverageMonthlyCost()
        );


        System.out.println("--------------------------------");

        // Use two months
        member.useMembershipMonth();
        member.useMembershipMonth();

        System.out.println("--------------------------------");

        System.out.println(
            "Remaining Months: "
            + member.getMembershipMonths()
        );

        System.out.println(
            "Used Months: "
            + member.getUsedMonths()
        );

        System.out.println(
            "Average Monthly Cost: $"
            + member.calculateAverageMonthlyCost()
        );


        System.out.println("--------------------------------");

        // Purchase another 12 months
        member.purchaseMembership(12);

        System.out.println("--------------------------------");

        System.out.println(
            "Remaining Months: "
            + member.getMembershipMonths()
        );

        System.out.println(
            "Used Months: "
            + member.getUsedMonths()
        );

        System.out.println(
            "Total Amount Paid: $"
            + member.getTotalAmountPaid()
        );

        System.out.println(
            "Average Monthly Cost: $"
            + member.calculateAverageMonthlyCost()
        );


        System.out.println("--------------------------------");

        // Invalid purchase
        member.purchaseMembership(-5);
}
}