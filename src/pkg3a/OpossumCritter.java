/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3a;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Hailey.Jones
 */
public class OpossumCritter {

    private int numStepsDead;

    public OpossumCritter() {
        numStepsDead = 0;
        setColor(Color.ORANGE);

    }

    public void processActors(ArrayList<Actor> actors) {
        int friendCount = 0;
        int foeCount = 0;
        int neitherCount = 0;

        for (Actor other : actors) {
            if (isFriend(other)) {
                friendCount++;
            } else if (isFoe(other)) {
                foeCount++;

            } else {
                neitherCount++;
            }

        }

    }

}
