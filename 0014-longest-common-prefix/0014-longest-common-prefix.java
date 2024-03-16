class Solution {
    public String longestCommonPrefix(String[] strs) {
            
//             if(strs.length==0){
//                 return "";
//             }

//             int i=0;
//             int min_length = strs[0].length();
//             String temporary;
//             while(i<strs.length){
//                 temporary=strs[i];
//                 if(temporary.length()<min_length){
//                     min_length = temporary.length();
//                 }
//                 i++;
//             }
//         i=0;
//         StringBuilder z = new StringBuilder();
//         StringBuilder final_string = new StringBuilder();
//         int j=0;
        
//              while (j < min_length) {
//                 String temp = strs[i];
//                 char a = temp.charAt(j);
//                 if (i == 0) {
//                     if(strs.length==1){
//                             return strs[0];         //case where u have only one string
//                         }
//                  z.append(a);
//                  i++;
//                 continue;
//             }
//     if (z.charAt(j) == a) {
//         if (i == (strs.length - 1)) {
//             final_string.append(a); // Append the character to final_string
//             j++;
//             i = 0;
//         } else {
//             i++;
//         }
//     } else {
//         break; // If characters don't match, come out of loop
//     }
// }
//             return (final_string.toString());

            String prefix = strs[0];                //trying to reduce the size of prefix by using indexOf()
            for(int i=1;i<strs.length;i++){
                while(strs[i].indexOf(prefix)!=0){
                            prefix = prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;


    }
}