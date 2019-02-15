import java.util.*;
import java.io.*;
/**
 *
 * @author frank
 */
public class ClassSchedule {
    public static void main(String[] args) throws Exception {
        Scanner dat = new Scanner( new File( "C:\\Users\\k1330132\\Desktop\\NetBeansProjects\\ClassSchedule\\src\\data"));
        String[] temp = (dat.nextLine()).split( "\\s+" );
        double[] fr = new double[temp.length];
        double[] sc = new double[temp.length];
        double[] tr = new double[temp.length];
        double[] fo = new double[temp.length];
        double[] fi = new double[temp.length];
        double[] si = new double[temp.length];
        double[] se = new double[temp.length];
        for( int i = 0; i < temp.length; i++){
            fr[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            sc[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            tr[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            fo[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            fi[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            si[i] = Double.parseDouble(temp[i]);
        }
        temp = (dat.nextLine()).split( "\\s+" );
        for( int i = 0; i < temp.length; i++){
            se[i] = Double.parseDouble(temp[i]);
        }
        String order = "";
        double dist = 0.0;
        Map<String, Double> orders = new TreeMap<String, Double>();
        
        for( int i = 1; i < 8; i++ ){
            for( int j = 1; j < 8; j++ ){
                for(int k = 1; k < 8; k++ ){
                    for( int l = 1; l < 8; l++ ){
                        for( int m = 1; m < 8; m++ ){
                            for( int n = 1; n < 8; n++ ){
                                for( int o = 1; o < 8; o++ ){
                                    if( i != j && i != k && i != l && i != m && i != n && i != o && j != k && j != l && j != m && j != n && j != o && k != l && k != m && k != n && k != o && l != m && l != n && l != o && m != n && m != o && n != o ){
                                        order = ( "" + i + j + k + l + m + n + o );
                                        dist = ( fr[i-1] + sc[j-1] + tr[k-1] + fo[l-1] + fi[m-1] + si[n-1] + se[o-1] );
                                        orders.put( order, dist );
                                        System.out.println( order + " " + dist );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Iterator<Map.Entry<String, Double>> itr = orders.entrySet().iterator();
        double big = Double.MIN_VALUE;
        double small = Double.MIN_VALUE;
        
        while(itr.hasNext()) 
        { 
            Map.Entry<String, Double> entry = itr.next(); 
            
        } 
    }
    
    
}
