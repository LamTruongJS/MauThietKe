/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.vd1;

/**
 *
 * @author Administrator
 */
public interface Iterator {
    int First();
    int Next();
    boolean isDone();
    int CurrentItem();
}
