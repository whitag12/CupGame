/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

import javax.swing.JOptionPane;

/**
 *
 * @author micheleburns
 */
public class Player {
    public class Bankaccount {
        private String Username;
        private int balance;

        public Bankaccount()
        {
            balance = 100;
        }

        public int balance(){
            return balance;
        }

        public void showBalance(String balance){
        }

        public void showName(String name){
        }

        public int withdraw(int wager1) {
            return balance - wager1;   
        }
        
        public int deposit(int win1){
            return balance += win1;
        }
    }

    double AccountBalance;
    int WinPercentage;
    String userName;
    int level;
    double wager;
    

    
    public Player()
    {
        level = 0;
        AccountBalance = 0;
    }
    
    public int getLevel()
    {
        // the current level the Player is on.
        return level;
    }
    
    public double getAccountBalance()
    {
        //returns the current Balance of the Player's "Bank"
        return AccountBalance;
    }
    
    public double PlaceBet()
    {   
     // needs more content, just haven't gotten there
        return 0;
    }
    public double CheckWager()
    {
        if(wager > AccountBalance){
          JOptionPane.showMessageDialog(null, "You do not have enough funds to place that bet"); 
        }else{
          PlaceBet();  
        }
        return 0;
        
    }        
}
