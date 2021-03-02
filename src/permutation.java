public class permutation {
    public static void main(String[] args) {
        String s="abde";
        int num=s.length();
        permutation per=new permutation();
        permutation.permute(s,0,num-1);

    }

    private static void permute(String s, int l, int r) {
        if(l==r){
            System.out.println(s);

        }
            else{
                for(int i=1;i<=r;i++){
                    s=swap(s,l,i);
                    permute(s,l+1,r);
                    s=swap(s,l,i);

                }
        }
    }

    private static String swap(String a, int i, int j) {
char temp;
char[] charArray=a.toCharArray();
temp=charArray[i];
charArray[i]=charArray[j];
charArray[j]=temp;
return String.valueOf(charArray);
    }
}
