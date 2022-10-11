/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
Helper.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.util;

import java.util.UUID;

public class Helper {

    /////////////////
    //public static UUID customerId() { };
    public static boolean isNullorEmpty(String s) {
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
}
