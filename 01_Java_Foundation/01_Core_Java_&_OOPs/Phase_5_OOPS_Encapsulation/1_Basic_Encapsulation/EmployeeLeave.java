
/*Employee Leave Management

We are still strictly at the Basic level. You solve this one yourself.

This problem will give you a little more practice with boolean, since you just learned how if(boolean) works.

Problem Statement

Create a class:

EmployeeLeave

with these private fields:

private int employeeId;
private String employeeName;
private int remainingLeaves;
private boolean onLeave;
Requirements
employeeId
Must be greater than 0.
Can be assigned only once.
Provide a getter.
employeeName
Cannot be null or empty.
Provide setter and getter.
remainingLeaves
Provide only a getter.
Do not create setRemainingLeaves().
onLeave
Provide:
public boolean isOnLeave()
Do not create setOnLeave().
Create:
addLeaves(int leaves)

It should accept only values greater than 0 and add them to remainingLeaves.

Otherwise print:

Invalid leave amount
Create:
takeLeave()

It should handle these situations:

If the employee is already on leave, print:
Employee is already on leave
If remainingLeaves is 0, print:
No leaves remaining
Otherwise:
subtract 1 from remainingLeaves
change onLeave to true
print:
Leave approved
Create:
returnFromLeave()

If the employee is currently on leave:

onLeave = false

and print:

Employee returned from leave

Otherwise print:

Employee is not currently on leave */
public class EmployeeLeave {
    private int employeeID;
    private String employeeName;
    private int remainingLeaves;
    private boolean onLeave;

    public void setEmployeeID(int employeeID){
        if(this.employeeID == 0 && employeeID > 0){
            this.employeeID = employeeID;
        }else{
            System.out.println("Employee Id cannot be Less than 0 and Assigned only once");
        }
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeName(String employeeName){
        if(this.employeeName != null && !employeeName.isEmpty()){
            this.employeeName = employeeName;
        }else{
            System.out.println("Employee Name cannot be Empty");
        }
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getRemainingLeaves(){
        return remainingLeaves;
    }

    public boolean isOnLeave(){
        return onLeave;
    }

    public void addLeaves(int leaves){
        if(leaves > 0){
            this.remainingLeaves = this.remainingLeaves + leaves;
        }else{
            System.out.println("Invalid Leave amount");
        }
    }

    public void takeLeave(){
        if(this.onLeave){
            System.out.println("Employee is already on leave");
        }else if(remainingLeaves == 0){
            System.out.println("No Leaves Remaining");
        }else{
            remainingLeaves = remainingLeaves - 1;
            onLeave = true;
            System.out.println("Leave Approved");
        }
    }

    public void returnFromLeave(){
        if(!this.onLeave){
            System.out.println("Employee is not curremtly on Leave");
        }else{
            this.onLeave = false;
            System.out.println("Employee Returned from leave");
        }
    }


    public static void main(String[] args) {
        EmployeeLeave employee = new EmployeeLeave();

        employee.setEmployeeID(101);
        employee.setEmployeeName("Pranit");
        employee.addLeaves(10);
        employee.takeLeave();

        System.out.println(employee.getRemainingLeaves());
        System.out.println(employee.isOnLeave());
        System.out.println(employee.getEmployeeName());


        employee.returnFromLeave();
        System.out.println(employee.isOnLeave());


    }
}
