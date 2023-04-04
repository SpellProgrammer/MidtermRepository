/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser{
    
    public enum Code{ZERO, ONE, TWO, THREE}
    public static Code cd;
    public StausUser(Code cd){
        this.cd = cd;
    }
    public Code getCd(){
        return this.cd;
    }
    public void setCd(Code cd){
        this.cd = cd;
    }
    
    public void statusDetail(StausUser user){
        
        switch(user.getCd()){
            case ZERO: 
                System.out.println("REJECTED");
                break;
            case ONE: 
                System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case THREE: 
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}
