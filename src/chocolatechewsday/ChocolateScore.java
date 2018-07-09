/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatechewsday;

/**
 *
 * @author zhuan
 */
class ChocolateScore {

    String name=null;
    long p=0;
    long f=0;
    long g=0;
    long score=-1;
    long getScore() {
        if (this.score!=-1) return score;
        this.score=p+f*1000L+g*1000000L+(p+f+g)*1000000000L;
        return this.score;
    }
    
}
