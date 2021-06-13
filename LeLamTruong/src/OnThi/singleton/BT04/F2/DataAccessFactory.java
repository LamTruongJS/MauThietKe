/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F2;

/**
 *
 * @author Administrator
 */
public class DataAccessFactory {
    public static DataAccess createDataAccess(String type){
        if(type == "SQL"){
            return new SQL();
        }
        else if(type == "MySQL"){
            return new MySQL();
        }
        return null;
    }
}
