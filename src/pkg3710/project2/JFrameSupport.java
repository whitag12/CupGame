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
public class JFrameSupport {
    public static int curve1to2(int x){
        double y = -.0017*(x*x)+.5362*x-61.69;
        y*=-1;
        return (int)y;
    }
    
    public static int curve2to1(int x){
        double y = .0017*(x*x)-.5362*x-24.31;
        y*=-1;
        return (int)y;
        //BRUHHHHHHHHH
    }
}

