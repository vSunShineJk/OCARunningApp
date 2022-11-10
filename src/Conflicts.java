//import java.util.*;

import java.sql.*;
import java.util.Date;
//import java.sql.Date;

public class Conflicts {
    public static void main(String[] args) {
        Date date;
        // some more code

        /* If we need a Date from java.sql. and java.util. at the same time we may import one of them import fully
        * and another one directly
        * */

        Date date1; // from java.util.Date;
        java.sql.Date date2; // from java.sql.Date;
    }
}
