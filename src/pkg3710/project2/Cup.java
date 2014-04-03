/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

/**
 *
 * @author nzayatz14
 */
public class Cup {
    int position;
    boolean hasBall;
    public Cup(){
        position = 0;
        hasBall = false;
    }
    
    public Cup(int p){
        position = p;
        hasBall = false;
    }
    
    public Cup(int p, boolean h){
        position = p;
        hasBall = h;
    }
    
    public Cup(Cup c){
        copyCup(c);
    }
    
    public int getPosition(){
        return position;
    }
    
    public boolean containsBall(){
        return hasBall;
    }
    
    public void setPosition(int p){
        position = p;
    }
    
    public void setContains(boolean c){
        hasBall = c;
    }
    
    public void copyCup(Cup c){
        position = c.getPosition();
        hasBall = c.containsBall();
    }
}
