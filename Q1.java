import java.util.ArrayList;
import java.util.List;

/**
 * Created by said on 2/20/2021.
 */
/*
{getList} ' ';5;<1...10>
// call getList function passing 3 params  ' ',  5 and an array of 10 elements


^^{{getList}} <><><>   // declare the getList function

    #list <- #1  // declare an empty list called list

    ++i #2 /        // loop  5 times ( 5 is the second param)

        #total <- #3.#i * 3    // compute total = element from third param based on i and multiplied with 3

        (#total !! 5,11,13)    // check if total  in 5, 11, 13

            #list +<- #1 +<- {split} #total   // if previous condition true then add to the list ' ' + the result of calling split function

    /

    ^#list         // return list



^^{{split}} <>         // declare the split function with one param

    (#1 % 2 >< 0)       // calculate  the param modulo 2  and compare to 0

        ^'foo'          // if true return foo

    (OR)

        ^'bar'          // otherwise return bar


 */
public class Q1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int[] Arr = {1,2,3,4,5,6,7,8,9,10};
        list = getList(' ', 5, Arr);
        System.out.println(list);
    }

    public static List<String> getList(char c, int cnt, int[]Arr){
        List<String> list = new ArrayList<String>();

        int total = 0;
        for ( int i = 0; i < cnt; i++){
            total = Arr[i] * 3;

            if ( total != 5 && total !=11 && total != 13){
                list.add(split(total));
            }
        }

        return list;
    }

    public static String split(int val){
       if ( val %2 != 0){
           return "foo";
       }else{
           return "bar";
       }

    }
}
